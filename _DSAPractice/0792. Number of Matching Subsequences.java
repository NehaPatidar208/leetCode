class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character,Queue<String>> map = new HashMap<>();
        int result = 0;
        for(int i=0;i<s.length();i++){
            map.putIfAbsent(s.charAt(i),new LinkedList<String>());
        }
        for(String word:words){
            if(map.containsKey(word.charAt(0))){
                map.get(word.charAt(0)).offer(word);
            }
        }
        for(int j=0;j<s.length();j++){
            Queue<String> tmp = map.get(s.charAt(j));
            int qsize= tmp.size();
            for(int i=0;i<qsize;i++){
                String str = tmp.poll();
                if(str.substring(1).length() == 0){
                    result++;
                }
                else if(map.containsKey(str.charAt(1))){
                    map.get(str.charAt(1)).offer(str.substring(1));
                }
            }
        }
        return result;
    }
}
