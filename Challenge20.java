
import java.util.*;

public class Challenge20 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter number of element:");
        int n= s.nextInt();
        System.out.println("Enter element into Stack:");
        for(int i =0; i<n;i++){
            stack.push(s.nextInt());
        }

        System.out.println("Original stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }

  
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }


        int top = stack.pop();


        sortStack(stack);


        sortedInsert(stack, top);
    }


    private static void sortedInsert(Stack<Integer> stack, int element) {

        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }


        int top = stack.pop();
        sortedInsert(stack, element);


        stack.push(top);
    }
}
