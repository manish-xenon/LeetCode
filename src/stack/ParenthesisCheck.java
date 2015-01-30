package stack;

/**
 * Created by manish on 1/8/15.
 */
public class ParenthesisCheck {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public ParenthesisCheck(){

    }
    public ParenthesisCheck(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    public void push(char j) {
        stackArray[++top] = j;
    }
    public char pop() {
        return stackArray[top--];
    }
    public char peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static boolean isValid(String s) {
        int len = s.length();
        int parenCount = 0;
        int braceCount = 0;
        int squareCount = 0;
        boolean valid = false;

        ParenthesisCheck ps = new ParenthesisCheck(len);
        for (char c : s.toCharArray())
        {
            if(c == '('){
                ps.push(c);
                parenCount++;
            }

            if(c == '{'){
                ps.push(c);
                braceCount++;
            }

            if(c == '['){
                ps.push(c);
                squareCount++;
            }

            if((c == ')' && parenCount == 0) || (c == '}' && braceCount == 0) || (c == ']' && squareCount == 0))
            {
                return false;
            }

            if(c == ')' && ps.peek() == '('){

                ps.pop();
                parenCount--;
            }

            if(c == '}' && ps.peek() == '{'){
                ps.pop();
                braceCount--;
            }

            if(c == ']' && ps.peek() == '['){
                ps.pop();
                squareCount--;
            }

        }
        if(parenCount == 0 & braceCount == 0 && squareCount == 0 && ps.isEmpty()){
            valid = true;
        }

        return valid;
    }


    public static void main(String[] args) {
        String s = "{[}";
        boolean b = isValid(s);
        System.out.println(b);
    }
}
