class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = [0]*len(prices)
        mx = prices[len(prices)-1]
        for i in range(len(prices)-2, -1, -1):
            mx= max(mx, prices[i])
            res[i] = max(res[i+1], mx-prices[i])
        return res[0]
        
            
            
        
