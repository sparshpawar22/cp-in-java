import java.util.*;

public class cf1440B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n * k];

            for (int i = 0; i < n * k; i++) {
                a[i] = sc.nextLong();
            }

            long pointer = n * k;
            long sum = 0;

            while (k-- > 0) {
                pointer -= (n / 2 + 1);
                sum += a[(int) pointer];
            }

            System.out.println(sum);
        }
    }
}
