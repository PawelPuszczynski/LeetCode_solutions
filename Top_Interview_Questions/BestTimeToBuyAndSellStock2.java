class Solution {
    public int maxProfit(int[] prices) {
        
        int result = 0;
        for (int i = 0; i < prices.length-1; i++) {

            while ((i != prices.length-2) && (prices[i+1] <= prices[i])) i++;
            result -= prices[i];
            
            while ((i != prices.length-1) && (prices[i+1] >= prices[i])) i++;
            result += prices[i];
            
        }
        return result;
        
    }
}