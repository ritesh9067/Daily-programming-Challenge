public class Challenge1 {
    public static void sort(int arr[]){
        int low =0;
        int mid =0;
        int high =arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swaps(arr,low,mid);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swaps(arr,mid,high);
                high--;
            }
        }
    }

    public static void swaps(int arr[], int i,int j) {
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }


    public static void main(String[] args){
        int arr[] ={0,1,2,1,0,2,1,0};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

