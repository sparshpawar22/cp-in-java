import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cf1883B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            int oddCount = 0;
            for (int count : freqMap.values()) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            }

            oddCount--;

            System.out.println(oddCount <= k ? "YES" : "NO");

        }

        sc.close();
    }
}
