<<<<<<< HEAD
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

=======
public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
>>>>>>> 93affaf (Added Best Time to Buy and Sell Stock solution)
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
<<<<<<< HEAD
=======

    public static void main(String[] args) {
        BuySellStock solution = new BuySellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices));
    }
>>>>>>> 93affaf (Added Best Time to Buy and Sell Stock solution)
}
