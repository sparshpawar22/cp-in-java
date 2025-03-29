import java.util.Scanner;

public class cf1837B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int longest_sub_len = 1;
            int current_sub_len = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    current_sub_len++;
                } else {
                    longest_sub_len = Math.max(longest_sub_len, current_sub_len);
                    current_sub_len = 1;
                }
            }
            longest_sub_len = Math.max(longest_sub_len, current_sub_len);
            System.out.println(longest_sub_len + 1);
        }
        sc.close();
    }
}
