class Solution {
    public boolean wordPattern(String pattern, String s) {
        String ar[] = s.split(" ", pattern.length());
        if(pattern.length()!=ar.length)return false;
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> map1 = new HashMap<>();
        for(int i =0 ; i< pattern.length();i++ ){
            if(!map.containsKey(pattern.charAt(i)) && !map1.containsKey(ar[i])){
                map.put(pattern.charAt(i),ar[i]);
                map1.put(ar[i],pattern.charAt(i));
            }
            else if(!map.containsKey(pattern.charAt(i)) || !map1.containsKey(ar[i])|| !map.get(pattern.charAt(i)).equals(ar[i]) || !map1.get(ar[i]).equals(pattern.charAt(i))) return false;
        }
        return true;
    }
}
