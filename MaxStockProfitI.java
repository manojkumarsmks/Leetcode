// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class MaxStockProfitI {

	public static void main(String[] args) {
		int[] prices = {7,4,5,3,4,1};
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		
		int minValue = prices[0];
		int maxProfit = 0;
		
		for(Integer price : prices) {
			
			if(price < minValue)
				minValue = price;
			else if(price-minValue > maxProfit)
				maxProfit = price - minValue;
		}
		
		return maxProfit;
	}

}
