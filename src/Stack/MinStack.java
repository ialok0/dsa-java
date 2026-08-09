package Stack;

import java.util.Stack;


/*

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

    MinStack() -> initializes the stack object.
    void push(int value) -> pushes the element value onto the stack.
    void pop() -> removes the element on the top of the stack.
    int top() -> gets the top element of the stack.
    int getMin() -> retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.

*/


public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    public void pop() {
         minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
