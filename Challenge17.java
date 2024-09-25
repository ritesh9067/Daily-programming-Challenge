
import java.util.*;

public class Challenge17{
    public static List<Integer> primeFactorization(int n){
        List<Integer> merilist = new ArrayList<>();
        int sum =n;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(isPrime(i)){
                while(sum%i==0){
                    sum =sum/i;
                    merilist.add(i);
                }
            }
            if(sum==1){
                return merilist;

            }
        }

        if(sum>1 && isPrime(sum)){
            merilist.add(sum);
        }

        return merilist;
    }

    public static boolean isPrime(int p){
        if(p<2){
            return false;
        }
        if(p==2){
            return true;
        }

        for(int i=3;i<=Math.sqrt(p);i++){
            if(p%i==0){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n =s.nextInt();
        System.out.println(primeFactorization(n));
    }
}
