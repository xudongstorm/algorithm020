package week4;

/*122. 买卖股票的最佳时机 II*/

public class MaxProfit {

    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=0){
            return 0;
        }
        int result = 0;
        for(int i=1; i<prices.length; i++){
            int dp = prices[i] - prices[i-1];
            if(dp>0){
                result += dp;
            }
        }
        return result;
    }
}
