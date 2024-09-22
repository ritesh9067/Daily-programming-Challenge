package challenge;
import java.util.*;

public class Challenge14{
    public static int stringWithKDistinct(String str,int k){
        Set<Character> myset = new HashSet<>();
        int count =0;

        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                myset.add(str.charAt(j));
                if(myset.size()==k){
                    count++;
                }
            }
            myset.clear();
        }

        return count;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String:");
        String str =s.next();

        System.out.println("Enter value of K:");
        int k =s.nextInt();

        System.out.println(stringWithKDistinct(str,k));
    }
}
