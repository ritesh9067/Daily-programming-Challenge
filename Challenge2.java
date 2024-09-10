import java.util.*;
public class Challenge2 {
    public static int findMissingNum(int arr[], int n){
        Arrays.sort(arr);
        int originalSum =0;
        int lastEle =arr[n-1];
        for(int i=1;i<=lastEle;i++){
            originalSum += i;
        }
        int actualSum =0;
        for(int i=0;i<n;i++){
            actualSum += arr[i];
        }

        return originalSum - actualSum;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element in array:");
        for(int i=0;i<n;i++){
            arr[i] =s.nextInt();
        }

        System.out.println(findMissingNum(arr,n));
    }
}
