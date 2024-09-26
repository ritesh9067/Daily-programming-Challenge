
import java.util.*;
public class Challenge17 {
    public static int findDivisors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=s.nextInt();

        System.out.println(findDivisors(n));
    }
}
