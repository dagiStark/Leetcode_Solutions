import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;     // main stack
    private Stack<Integer> minStack;  // stack to track minimums

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        // if minStack is empty or val <= current min, push to minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            // otherwise, repeat the current min
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop(); // always pop from minStack too
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek(); // top of minStack is current min
    }
}
