
import java.util.*;

public class Challenge10 {
    public static List<List<String>> findAnagrams(String s1[]){
        Map<String ,List<String>> myhashmap  = new HashMap<>();

        for(String str:s1){
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if(!myhashmap.containsKey(sorted)){
                myhashmap.put(sorted,new ArrayList<>());
            }
            myhashmap.get(sorted).add(str);
        }

        return new ArrayList<>(myhashmap.values());


    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of String:");
        int n = s.nextInt();

        String s1[]= new String[n];

        System.out.println("Enter the element in String:");
        for(int i=0;i<n;i++){
            s1[i] = s.next();
        }
        System.out.println(findAnagrams(s1));

    }
}
