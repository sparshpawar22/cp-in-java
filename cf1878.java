import java.util.Scanner;

public class cf1878 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            long min = (k * (k + 1)) / 2;
            long max = (k * (2 * n - k + 1)) / 2;

            if (min <= x && max >= x) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}
