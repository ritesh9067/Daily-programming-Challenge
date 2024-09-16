
import java.util.*;
public class Challenge8 {

    public static String reverseString(String s){
        String[] parts = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for(int i=parts.length-1;i>=0;i--){
            sb.append(parts[i]+" ");
        }

        String result = sb.toString();
        result.trim();

        return result.trim();


    }
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter string:");
        String st = s.nextLine();


        System.out.println(reverseString(st));

    }
}
