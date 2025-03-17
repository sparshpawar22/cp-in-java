import java.util.*;

public class cf208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(a.replaceAll("WUB", " ").replace(" +", " ").trim());
    }
}
