class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int result=-1;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                result = Math.max(result,i - map.get(s.charAt(i))-1);
            }
            else{
                map.put(s.charAt(i),i);
            }
        }
        return result;
    }
}
