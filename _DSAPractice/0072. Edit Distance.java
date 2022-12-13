class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int pre[] =new int[m+1],cur[] = new int[m+1];
        for(int j=0;j<=m;j++){
            pre[j]=j;
        }
        for(int i=1;i<=n;i++){
            cur[0]=i;
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    cur[j]=pre[j-1];
                }else{
                    cur[j] =1+ Math.min(Math.min(cur[j-1],pre[j]),pre[j-1]);
                }
            }
            pre = cur.clone();
        }
        return pre[m];
    }
}
