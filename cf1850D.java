import java.util.*;

public class cf1850D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            int counter = 1;
            int ans = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k)
                    counter++;
                else {
                    counter = 1;
                }
                ans = Math.max(ans, counter);
            }
            System.out.println(n - ans);
        }
    }
}
