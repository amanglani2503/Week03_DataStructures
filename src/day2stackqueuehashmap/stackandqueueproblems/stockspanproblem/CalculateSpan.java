package day2stackqueuehashmap.stackandqueueproblems.stockspanproblem;

import java.util.Stack;

public class CalculateSpan {
    public int[] calculateSpan(int[] prices){
        int numberOfDays = prices.length;
        int[] stockSpan = new int[numberOfDays];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numberOfDays; i++) {

            while(!stack.isEmpty() && prices[i] >= prices[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                stockSpan[i] = i + 1;
            }else{
                stockSpan[i] = i - stack.peek();
            }
            stack.push(i);
        }

        return stockSpan;
    }
}