package challenge;
import java.util.*;

public class Challenge13 {
    public static String findLongestPalindrome(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String max = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    String currentPalindrome = str.substring(i, j + 1);
                    if (currentPalindrome.length() > max.length()) {
                        max = currentPalindrome;
                    }
                }
            }
        }

        return max;
    }

    private static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = s.next();
        System.out.println(findLongestPalindrome(str));
    }
}
