package day2stackqueuehashmap.stackandqueueproblems.stockspanproblem;

public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 120, 132, 145, 110, 100, 160, 158};
        int[] stockSpans = new int[prices.length];

        CalculateSpan obj = new CalculateSpan();
        stockSpans = obj.calculateSpan(prices);

        System.out.println("Printing Spans - ");
        for(int stockSpan : stockSpans){
            System.out.print(stockSpan + "  ");
        }
    }

}
