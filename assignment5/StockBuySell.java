package DSA_GATE.assignment5;

public class StockBuySell {
    public static void stockBuySell(int[] prices, int n) {
        if (n == 1) {
            System.out.println("No Profit");
            return;
        }

        int i = 0;
        boolean foundProfit = false;
        while (i < n - 1) {
            
            while ((i < n - 1) && (prices[i + 1] <= prices[i]))
                i++;

            
            if (i == n - 1)
                break;

            int buy = i++;

            
            while ((i < n) && (prices[i] >= prices[i - 1]))
                i++;

            int sell = i - 1;

            foundProfit = true;
            System.out.printf("%d,%d\n",buy,sell);
        }

        if (!foundProfit)
            System.out.println("No Profit");
    }

    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int n = prices.length;
        stockBuySell(prices, n);
    }
}
