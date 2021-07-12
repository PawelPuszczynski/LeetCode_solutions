class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int tempMax = 0;
        
        for (int i = 0; i < prices.length; i++) {
            
        for (int j = i+1; j <prices.length; j++) {
            
            if (prices[j] <= prices [i]) break;
            tempMax = prices[j] - prices[i];
            if(tempMax > maxProfit) maxProfit = tempMax;
           
        }
        }
        
        return maxProfit;
        
    }
}