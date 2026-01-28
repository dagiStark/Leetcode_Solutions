import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> stack; // list to store stack elements

    // Constructor: create empty stack
    public MyStack() {
        stack = new ArrayList<>();
    }
    
    // Push element onto the stack
    public void push(int x) {
        stack.add(x); // add to the end of the list (top of the stack)
    }
    
    // Remove and return the top element
    public int pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1); // remove last element
        }
        return -1; // or throw exception if you want
    }
    
    // Return the top element without removing it
    public int top() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1); // last element is the top
        }
        return -1; // or throw exception if you want
    }
    
    // Check if the stack is empty
    public boolean empty() {
        return stack.isEmpty();
    }
}
