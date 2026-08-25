class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        var sell = 0
        var maxProfit = 0
        for(amount in prices) {
            if(amount < buy) {
                buy = amount
            }  else {
                maxProfit = maxOf(maxProfit, amount-buy)
            }
        }

        return maxProfit
    }
}
