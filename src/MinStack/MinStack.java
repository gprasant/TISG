package MinStack;

import sun.invoke.empty.Empty;

import java.util.EmptyStackException;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> internalStack;
    private Stack<Integer> minStack;

    public MinStack() {
        internalStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    /// Peek the element on top of the stack
    public int peek() {
        return internalStack.peek();
    }

    /// push newVal element onto the stack
    public Integer push(int newVal) {
        // if minStack is empty or newVal <= minStack.peek()
            // insertInto Minstack()
        internalStack.push(newVal);
        if(minStack.empty() || newVal <= minStack.peek()) {
            minStack.push(newVal);
        }
        return newVal;
    }

    /// Get the top element of the stack
    public int pop() {
        int poppedValue = internalStack.pop();
        int minValue = minStack.peek();

        if (minValue == poppedValue) {
            minStack.pop();
        }
        return poppedValue;
    }

    /// Look at the minimum element in the stack so far
    public int minPeek() {
        return minStack.peek();
    }
}
