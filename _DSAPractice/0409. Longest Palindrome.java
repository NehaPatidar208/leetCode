class Solution {
    public int longestPalindrome(String s) {
        int low[] = new int[26];
        int upr[] = new int[26];
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                low[s.charAt(i)-'a']++;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                upr[s.charAt(i)-'A']++;
            }
        }
        int result=0;
        boolean isOdd = false;
        for(int i = 0;i < 26;i++){
            if(low[i]%2==1 || upr[i]%2==1){
                isOdd = true;
            }
            result += (low[i]/2)*2;
            result += (upr[i]/2)*2;
        }
        if(isOdd){
            result+=1;
        }
        return result;
    }
}
