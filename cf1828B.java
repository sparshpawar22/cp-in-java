import java.util.*;

public class cf1828B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] pos = new int[n + 1];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                pos[a[i]] = i;
            }

            int res = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != i + 1) {
                    res = gcd(res, Math.abs(pos[i + 1] - i));
                }
            }

            System.out.println(res);
        }
        sc.close();
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
