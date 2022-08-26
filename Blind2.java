public class Blind2 {
    public int maxProfit(int[] prices) {
        //set minimum to inf (or max value for ints in java in this case)
        int min = Integer.MAX_VALUE;
        //set profit to 0 since at day 0 we have 0 profit
        int profit = 0;
        //for the first day, the minimum buy price will be the first day's price and the profit will be
        //0 since you won't make money by buying and selling for the same price on the first day
        //from each day onwards, compare the buying price to the previous minimum buying price and if
        //it's lower, then store that as the new minimum buying price. If this is the case, since the 
        //buying day is reset, the next days will have to compete with the profit of the previous
        //buying price's profits, stored in the profit variable. 
        for (int p : prices){
            min = Math.min(min, p);
            profit = Math.max(profit, p-min);
        }
        return profit;
    }
}
