import static java.util.Map.entry; 
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer>map = Map.ofEntries(entry('I', 1), entry('V', 5), entry('X', 10),entry('L', 50), entry('C', 100), entry('D', 500), entry('M', 1000));
        for(int i = 0;i<s.length() ; i++){
            if(i==s.length()-1 || map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                result += map.get(s.charAt(i));
            }
            else {
                result+= (map.get(s.charAt(i+1))-map.get(s.charAt(i)));
                i++;
            }
        }
        return result;
    }
}
