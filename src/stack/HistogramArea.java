package stack;

import java.util.Stack;

/**
 * Created by manish on 1/11/15.
 */
public class HistogramArea {

    public int largestRectangleArea(int[] height) {
        Stack<Integer> htStack = new Stack<Integer>();
        Stack<Integer> indexes = new Stack<Integer>();
        int largestArea = 0;
        for(int i=0; i< height.length; i++){
            if(htStack.empty() || height[i] > htStack.peek()){
                htStack.push(height[i]);
                indexes.push(i);
            }
            else if(height[i] < htStack.peek()){
                int lastIndex = 0;

                while(!htStack.empty() && height[i] < htStack.peek()){
                    lastIndex = indexes.pop();
                    int tempArea = htStack.pop() * (i - lastIndex);
                    if(tempArea > largestArea) largestArea = tempArea;
                }
                htStack.push(height[i]);
                indexes.push(lastIndex); //trick
            }
        }
        while(!htStack.empty()){
            int tempArea = htStack.pop() * (height.length - indexes.pop());
            if(tempArea > largestArea) largestArea = tempArea;
        }

        return largestArea;

    }

    public static void main(String[] args) {
        HistogramArea ha = new HistogramArea();
        int height[] = {2,1,5,6,2,3};
        int area = ha.largestRectangleArea(height);
        System.out.println(area);
    }
}
