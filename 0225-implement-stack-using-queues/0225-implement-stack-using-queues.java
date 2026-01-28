import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element x onto stack.
    public void push(int x) {
        q1.offer(x);
    }

    // Removes the element on top of the stack and returns it.
    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int top = q1.poll(); // last element

        // swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Get the top element.
    public int top() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int top = q1.peek();   // don't remove yet
        q2.offer(q1.poll());   // move it to q2

        // swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Returns whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
