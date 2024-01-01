class Solution {
    public int maxProfit(int[] values) {
        int n = values.length;
        int cur[] = new int[2], ahead[] = new int[2], ahead2[] = new int[2];
        for(int ind=n-1;ind>=0;ind--){
            cur[1]= Math.max((-values[ind]+ahead[0]),ahead[1]);
            cur[0]= Math.max((values[ind] + ahead2[1]),ahead[0]);
            ahead2[1] = ahead[1];
            ahead[0] = cur[0];
            ahead[1] = cur[1];
        }
        return cur[1];
    }
}
