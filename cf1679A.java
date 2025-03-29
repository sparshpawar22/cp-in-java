import java.util.Scanner;

public class cf1679A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (n % 2 != 0 || n < 4) {
                System.out.println("-1");
            } else {
                long max_bus = n / 4;
                long min_bus = (n + 5) / 6;
                System.out.println(min_bus + " " + max_bus);
            }
        }
    }
}
