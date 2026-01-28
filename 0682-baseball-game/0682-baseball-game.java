import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("+")) {
                // sum of last two scores
                int last = stack.pop();
                int newScore = last + stack.peek();
                stack.push(last);    // put last back
                stack.push(newScore); // push new score
            } else if (op.equals("D")) {
                // double the last score
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                // remove last score
                stack.pop();
            } else {
                // it's a number
                stack.push(Integer.parseInt(op));
            }
        }
        
        // sum all scores
        int total = 0;
        for (int score : stack) {
            total += score;
        }
        return total;
    }
}
