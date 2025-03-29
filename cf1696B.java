import java.util.Scanner;

public class cf1696B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            boolean cur = false;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x != 0) {
                    cur = true;
                } else if (cur) {
                    count++;
                    cur = false;
                }
            }

            if (cur) {
                count++;
            }

            count = Math.min(count, 2);
            System.out.println(count);
        }

        sc.close();
    }
}
