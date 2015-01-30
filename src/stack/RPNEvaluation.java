package stack;

/**
 * Created by manish on 1/8/15.
 */
public class RPNEvaluation {
    private int maxSize;
    private String[] stackArray;
    private int top;

    RPNEvaluation(){

    }

    public RPNEvaluation(int s){
        maxSize = s;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String j) {
        stackArray[++top] = j;
    }
    public String pop() {
        return stackArray[top--];
    }
    public String peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static int evalRPN(String[] tokens) {
        int s = tokens.length;
        RPNEvaluation rpne = new RPNEvaluation(s);
        String s1;
        String s2;
        int temp1;
        int temp2;
        int temp;
        int answer = 0;
        String finalValue;
        String intermediate;

        for(String str : tokens){

            if(str.matches("^-?[0-9]+")){
                rpne.push(str);
            }

            if(str.matches("[-]")){
                s1 = rpne.pop();
                s2 = rpne.pop();
                temp1 = Integer.parseInt(s1);
                temp2 = Integer.parseInt(s2);
                temp = temp2 - temp1;
                intermediate = String.valueOf(temp);
                rpne.push(intermediate);
            }

            if(str.matches("[+]")){
                s1 = rpne.pop();
                s2 = rpne.pop();
                temp1 = Integer.parseInt(s1);
                temp2 = Integer.parseInt(s2);
                temp = temp2 + temp1;
                intermediate = String.valueOf(temp);
                rpne.push(intermediate);
            }

            if(str.matches("[*]")){
                s1 = rpne.pop();
                s2 = rpne.pop();
                temp1 = Integer.parseInt(s1);
                temp2 = Integer.parseInt(s2);
                temp = temp2 * temp1;
                intermediate = String.valueOf(temp);
                rpne.push(intermediate);
            }

            if(str.matches("[/]")){
                s1 = rpne.pop();
                s2 = rpne.pop();
                temp1 = Integer.parseInt(s1);
                temp2 = Integer.parseInt(s2);
                temp = temp2 / temp1;
                intermediate = String.valueOf(temp);
                rpne.push(intermediate);
            }

        }

        finalValue = rpne.pop();
        if(rpne.isEmpty()){
            answer = Integer.parseInt(finalValue);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s = {"1", "-4", "*"};
        int b = evalRPN(s);
        System.out.println(b);
    }
}
