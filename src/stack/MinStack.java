package stack;


import java.util.Stack;

/**
 * Created by manish on 1/9/15.
 */
public class MinStack {
    //Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int x) {
        Integer i = x;
        if(minStack.empty() || minStack.peek() > i){
            minStack.push(i);
        }
        else
            minStack.push(minStack.peek());
    }

    public void pop() {
        minStack.pop();
    }

    public int top() {
       return minStack.peek();
    }

    public int getMin() {
         return minStack.peek();
    }
}
