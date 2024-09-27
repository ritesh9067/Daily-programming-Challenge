

import java.util.*;

public class Challenge19 {
    public static int evaluate(String s) {
        String tokens[] = s.split("\\s+");
        Stack<Integer> mystack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^")) {
                int ele2 = mystack.pop(); 
                int ele1 = mystack.pop(); 

                switch (token) {
                    case "+":
                        mystack.push(ele1 + ele2);
                        break;
                    case "-":
                        mystack.push(ele1 - ele2);
                        break;
                    case "*":
                        mystack.push(ele1 * ele2);
                        break;
                    case "/":
                        mystack.push(ele1 / ele2);
                        break;
                    case "^":
                        mystack.push((int) Math.pow(ele1, ele2)); 
                        break;
                }
            } else {
                int ele = Integer.parseInt(token);
                mystack.push(ele);
            }
        }

        return mystack.pop();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String:");
        String str =  s.next();
        System.out.println(evaluate(str)); 
    }
}
