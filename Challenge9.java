package challenge;
import java.util.*;

public class Challenge9 {
    public static String findLongestPrefix(String str[],int n){
        Arrays.sort(str);

        String first = str[0];
        String last = str[n-1];

        int min = Math.min(first.length(),last.length());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<min;i++){
            if(first.charAt(i)!=last.charAt(i)){
                return sb.toString();
            }
            else{
                sb.append(first.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array String:");
        int n =s.nextInt();

        String str[] = new String[n];

        System.out.println("Enter Element in Array of String:");
        for(int i=0;i<n;i++){
            str[i] = s.next();
        }

        System.out.println(findLongestPrefix(str,n));
    }

}
