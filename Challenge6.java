

import java.util.*;

public class SubArrayWithSumZero {

  
    public static List<int[]> subArray(int[] arr, int n) {
        int sum = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];

           
            if (sum == 0) {
                result.add(new int[]{0, i});
            }

           
            if (sumIndexMap.containsKey(sum)) {
                int prevIndex = sumIndexMap.get(sum);
                result.add(new int[]{prevIndex + 1, i});
            } else {
                sumIndexMap.put(sum, i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n =s.nextInt();
        int[] arr = new int[n];

        System.out.println("ENter Array Element:");
        for(int i=0;i<n;i++){
            arr[i] =s.nextInt();
        }

        List<int[]> result = subArray(arr, n);

        if (result.isEmpty()) {
            System.out.println("[]");
        } else {
            for (int[] subArray : result) {
                System.out.print(Arrays.toString(subArray));
            }
        }
    }
}
