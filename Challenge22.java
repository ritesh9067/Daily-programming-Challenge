
import java.util.*;

public class Challenge22 {
    public static int firstOccurKtime(int arr[],int k){
     HashMap<Integer,Integer> myhash = new HashMap<>();
     for(int i:arr){
         if(!myhash.containsKey(i)){
             myhash.put(i,1);
         }
         else{
             myhash.put(i,myhash.getOrDefault(i,1)+1);
         }
     }
     for(int key: myhash.keySet()){
         if(myhash.get(key)==k){
             return key;
         }
     }

     return -1;

    }
    public static void main(String[] args){
        int arr[] ={1, 1, 1, 1};
        int k =1;

        System.out.println(firstOccurKtime(arr,k));
    }

}
