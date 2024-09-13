
import java.util.*;
public class Challenge5 {
    public static List<Integer> findLeaders(int arr[]){
        int k =0;
        List<Integer> mylist = new ArrayList<>();


        for(int i=0;i<arr.length;i++){
            int count =arr.length-i-1;
            int track =0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    track++;
                }
                if(count==track){
                   mylist.add(arr[i]);
                }
            }
        }

        return mylist;
    }
    public static void main(String[] args){
        int arr[] ={16,17,4,3,5,2};
        int temp[] = new int[arr.length];
        List<Integer> leaders = findLeaders(arr);
        System.out.println(leaders);


    }
}
