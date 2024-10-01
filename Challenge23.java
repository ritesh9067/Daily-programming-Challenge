
import java.util.*;

public class Challenge23 {
    public static int[] maxSlidingWindow(int nums[] ,int k){
        if (nums.length == 0) return new int[0];
        if (k == 0) return nums;
       // 1,3,-1,-3,5,3,6,7
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }


            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }


            deque.offer(i);


            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args){

    Scanner s = new Scanner(System.in);

    System.out.println("Enter size of array:");
    int n  = s.nextInt();

    int nums[] = new int[n];


    System.out.println("Enter element in array:");
    for(int i=0;i<n;i++){
        nums[i] = s.nextInt();
    }

    System.out.println("Enter value of K:");
    int k= s.nextInt();

        System.out.println(Arrays.toString(maxSlidingWindow(nums ,k)));

}
}
