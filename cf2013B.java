import java.util.*;

public class cf2013B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(a));

        }
    }

    static long solve(int[] a) {
        return Arrays.stream(a).asLongStream().sum() - 2 * a[a.length - 2];
    }
}
