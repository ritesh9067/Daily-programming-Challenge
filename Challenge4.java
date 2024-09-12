
import java.util.*;

public class Challenge4 {
    public static void mergeArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        for (int i = 0; i < m; i++) {
            if (arr1[i] > arr2[0]) {
                // Swap arr1[i] and arr2[0]
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                // Sort arr2
                Arrays.sort(arr2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int m =s.nextInt();
        System.out.println("Enter size of second array:");
        int n =s.nextInt();

        int[] arr1 =new int[m];
        int[] arr2 = new int[n];

        System.out.println("Enter element in array 1:");
        for(int i=0;i<m;i++){
            arr1[i] =s.nextInt();
        }

        System.out.println("Enter element in array 2:");
        for(int j=0;j<n;j++){
            arr2[j] = s.nextInt();
        }

        mergeArrays(arr1, arr2);

       for(int i:arr1){
           System.out.print(i+" ");
       }
       System.out.println();
       for(int j:arr2){
           System.out.print(j+" ");
       }
    }
}
