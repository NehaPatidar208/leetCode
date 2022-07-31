class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length() ==0)return "";
        
        int[][]dp = new int [s.length()][s.length()];
        int mx = Integer.MIN_VALUE,indexI=0,indexJ=0;
        for(int i =0;i<s.length();i++){
            for(int j=0,k=j+i;j<s.length()-i;j++,k++){
                if(j==k){
                    dp[j][k]=1;
                }else if(s.charAt(j)==s.charAt(k) && dp[j+1][k-1]!=-1){
                    dp[j][k] = dp[j+1][k-1]+2;
                    if(dp[j][k] > mx){
                        mx=dp[j][k];
                        indexI=j;
                        indexJ=k;
                    }
                }else{
                    dp[j][k] = -1;
                }
            }
        }
        return s.substring(indexI,indexJ+1);
    }
}
