import java.util.*;

class Challenge7 {
    public static int totalWater(int arr[],int n){
        int right[] = new int[n];
        int left[] = new int[n];
        
        left[0] =arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>left[i-1]){
                left[i] =arr[i];
            }
            else{
                left[i] =left[i-1];
            }
        }
        
        right[n-1] =arr[n-1];
        for(int j=n-2;j>=0;j--){
            if(arr[j]>right[j+1]){
                right[j] =arr[j];
            }
            else{
                right[j] =right[j+1];
            }
        }
        
        int sum =0;
        
        
        for(int i=0;i<n;i++){
            int min = Math.min(left[i],right[i]);
            int differ = min- arr[i];
            sum = sum+ differ;
        }
        
        return sum;
    }
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter array size:");
    int n = s.nextInt();
    
    int arr[] = new int[n];
    System.out.println("Enter element in array:");
    for(int i=0;i<n;i++){
        arr[i] =s.nextInt();
    }
      System.out.println("water trapped:"+totalWater(arr,n));
     
    }
}
