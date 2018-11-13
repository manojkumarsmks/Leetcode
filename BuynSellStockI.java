// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuynSellStockI {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProf(prices));
	}
	
	public static int maxProfit(int[] prices) {
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				max = Math.max(max,prices[j]-prices[i]);
			}
		}
		
		return max;
	}
	
	
	public static int maxProf(int[] prices)  {
		
		if(prices == null || prices.length == 0)
			return 0;
		
		int min = prices[0];
		int max = 0;
		
		for (int i = 1; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i]-min);
		}
		
		
		return max;
	}
}
