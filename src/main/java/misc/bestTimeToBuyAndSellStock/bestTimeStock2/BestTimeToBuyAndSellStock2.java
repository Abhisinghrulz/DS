package misc.bestTimeToBuyAndSellStock.bestTimeStock2;

/**
 * https://www.youtube.com/watch?v=blUwDD6JYaE&list=PLi9RQVmJD2fZGdIX-y3-X37YUAWxh6GqH&index=30
 */
public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock2();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
       if(prices == null || prices.length == 0)
       {
           return 0;
       }

       int profit = 0;
       for(int i=0; i<prices.length-1; i++)
       {
            if(prices[i+1] > prices[i])
            {
                profit += prices[i+1] -prices[i];
            }
       }
       return profit;
    }
}
