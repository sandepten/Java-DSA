// Here we are given stock prices for 7 days of a company and then we have to find out the span (span is the max number of consecutive days for which price<=today's price)

import java.util.Stack;

public class StackSpanProblem {
  public static void stockSpan(int stocks[], int span[]) {
    Stack<Integer> s = new Stack<>();
    span[0] = 1; // because the span for the first day is always 1
    s.push(0);

    for (int i = 1; i < stocks.length; i++) {
      int currPrice = stocks[i];
      while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
        s.pop();
      }
      if (s.isEmpty()) {
        span[i] = i + 1;
      } else {
        int prevHigh = s.peek();
        span[i] = i - prevHigh;
      }
      s.push(i);
    }
  }

  public static void main(String[] args) {
    int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
    int span[] = new int[stocks.length];
    stockSpan(stocks, span);

    for (int i = 0; i < span.length; i++) {
      System.out.print(span[i] + " ");
    }
  }
}
