// Here we are given stock prices for 7 days of a company and then we have to find out the span (span is the max number of consecutive days for which price<=today's price)

import java.util.Stack;

public class StackSpanProblem {
  public static int findSpan(Stack<Integer> s, int position) {
    if (position == 0) {
      return 1;
    }
    int i = 0;
    int prevHigh = 0;
    int prevHighPosition = 0;
    while (i < position) {
      prevHigh = Math.max(prevHigh, s.pop());
      if (s.peek() >= prevHigh) {
        prevHigh = s.pop();
        prevHighPosition = i;
      }

    }
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(100);
    s.push(80);
    s.push(60);
    s.push(70);
    s.push(60);
    s.push(85);
    s.push(100);

  }
}
