class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length, aheadbuy =0, aheadnotbuy=0,curbuy=0,curnotbuy=0;
        for(int ind = n-1;ind>=0;ind--){
            curbuy = Math.max((-prices[ind]+aheadnotbuy),aheadbuy);
            curnotbuy = Math.max(prices[ind]+aheadbuy,aheadnotbuy);
            aheadbuy=curbuy;
            aheadnotbuy=curnotbuy;
        }
        return aheadbuy;
    }
}
