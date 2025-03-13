import java.lang.reflect.Array;
import java.util.*;

public class cf406A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
