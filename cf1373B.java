import java.util.Scanner;

public class cf1373B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int ones = 0;
            int zeroes = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroes++;
                } else
                    ones++;
            }

            int ans = Math.min(ones, zeroes);

            if (ans % 2 == 1) {
                System.out.println("DA");
            } else
                System.out.println("NET");
        }
        sc.close();
    }
}
