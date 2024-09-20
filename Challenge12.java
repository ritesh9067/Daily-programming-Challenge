package challenge;
import java.util.*;

public class Challenge12{
    public static boolean validOrNot(String str){
        Stack<Character> mystack = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                mystack.push(str.charAt(i));
            }
            else if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']'){
                if(str.charAt(i)==')' && mystack.peek()=='('){
                    mystack.pop();
                }
                else if(str.charAt(i)=='}' && mystack.peek()=='{'){
                    mystack.pop();
                }
               else if(str.charAt(i)==']' && mystack.peek()=='['){
                    mystack.pop();
                }
               else{
                   return false;
                }

            }
            else{
                if(!mystack.isEmpty()){
                    return false;
                }


            }
        }
        return true;

    }
    public static void main(String[] args){
        String str ="[{()}]";

        System.out.println(validOrNot(str));

    }
}
