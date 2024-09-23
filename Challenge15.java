package challenge;
import java.util.*;

public class Challenge15 {
    public static int findSubNonRepeat(String s){
        List<Character> mylist = new ArrayList<>();
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (!mylist.contains(currentChar)) {
                mylist.add(currentChar);
                currentCount++;
            } else {
                while (mylist.contains(currentChar)) {
                    mylist.remove(0);
                    currentCount--;
                }
                mylist.add(currentChar);
                currentCount++;
            }

            maxCount = Math.max(currentCount, maxCount);
        }

        return maxCount;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String:");
        String str=  s.next();

        System.out.println(findSubNonRepeat(str));
    }
}
