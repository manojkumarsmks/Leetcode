// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BuynSellStockII {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		
		int min = 0;
		int total = 0;
		
		int i = 0;
		
		while(i < prices.length-1) {
			
			while(i < prices.length-1 && prices[i] >= prices[i+1])
				i++;
			min = prices[i];
		
			while(i < prices.length-1 && prices[i+1] > prices[i]) 
				i++;
			
			
			total += (prices[i]-min);
		}
        
		return total;
    }

}
