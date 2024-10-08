package challenge;
import java.util.*;

public class NthFibonacci {
    public static int findNthfibonacci(int n,int dp[]){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int sum =findNthfibonacci(n-1,dp) +findNthfibonacci(n-2,dp);
        dp[n] =sum;

        return dp[n];
    }
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();

        int dp[] = new int[n+1];

        System.out.println(findNthfibonacci(n ,dp));
    }
}
