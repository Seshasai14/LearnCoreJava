public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        //Bruteforce Method
        int[] prices = {7,1,5,3,6,4};
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=i;j<prices.length;j++)
            {
                if(maxProfit<(prices[j]-prices[i]))
                {
                    maxProfit=prices[j]-prices[i];
                }
            }
        }
        System.out.println(maxProfit);
        int maxiProfit =0;
        int miniPrice=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(miniPrice>prices[i])
            {
                miniPrice=prices[i];
            }
            if((prices[i]-miniPrice)> maxiProfit)
            {
                maxiProfit =prices[i]-miniPrice;
            }
        }
        System.out.println(maxiProfit);
    }

}
