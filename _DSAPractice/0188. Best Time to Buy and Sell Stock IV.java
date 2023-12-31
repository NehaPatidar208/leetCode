class Solution {
    public int maxProfit(int k, int[] values) {
        int n = values.length;
        int ahead[][] = new int[2][k+1], cur[][] = new int[2][k+1];
        for(int ind =n-1;ind >=0;ind--){
            for(int buy = 0; buy <2;buy++){
                for(int cap=1;cap<=k;cap++){
                    if(buy==1){
                        cur[buy][cap] = Math.max(-values[ind]+ahead[0][cap], ahead[1][cap]);
                    }
                    else{
                        cur[buy][cap] = Math.max(values[ind] + ahead[1][cap-1],ahead[0][cap]);
                    }
                    
                }
                ahead = cur;
            }
        }
        return ahead[1][k];
    }
}
