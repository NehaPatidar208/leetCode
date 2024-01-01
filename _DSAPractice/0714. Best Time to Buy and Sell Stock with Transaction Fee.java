class Solution {
    public int maxProfit(int[] values, int fee) {
        int n = values.length;
        int cur[] = new int[2], ahead[] = new int[2];
        for(int ind=n-1;ind>=0;ind--){
            cur[1]= Math.max((-values[ind]+ahead[0]),ahead[1]);
            cur[0]= Math.max((values[ind] + ahead[1] -fee),ahead[0]);
            ahead[0] = cur[0];
            ahead[1] = cur[1];
        }
        return cur[1];
    }
}
