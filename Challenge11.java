
import java.util.*;

public class Challenge11 {
    public static List<String> permute(String str) {
        List<String> ans = new ArrayList<>();
        StringBuilder ds = new StringBuilder();
        boolean[] freq = new boolean[str.length()];

        recurPermute(str, ds, ans, freq);
        return ans;
    }

    public static void recurPermute(String str, StringBuilder ds, List<String> ans, boolean[] freq) {
        if (ds.length() == str.length()) {
            ans.add(ds.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.append(str.charAt(i));
                recurPermute(str, ds, ans, freq);
                ds.deleteCharAt(ds.length() - 1);
                freq[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String input = s.next();
        System.out.println(permute(input));
    }
}
