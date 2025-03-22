import java.util.Scanner;

public class cf1875A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long ans = b - 1;

            for (long i = 0; i < n; i++) {
                long ai = sc.nextLong();
                if (ai <= a - 1) {
                    ans += ai;
                } else {
                    ans += a - 1;
                }
            }

            ans++;
            System.out.println(ans);
        }
    }
}
