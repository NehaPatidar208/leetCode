class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        for(String word : words){
            for(int i=0;i<word.length();i++){
                charCountMap.put(word.charAt(i), charCountMap.getOrDefault(word.charAt(i),0)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if(entry.getValue()% words.length !=0)return false;
        }
        return true;
    }
}
