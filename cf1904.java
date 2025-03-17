import java.util.*;;

public class cf1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();

            Set<String> knightMovesSet = knightMoves(xk, yk, a, b);
            Set<String> queenMovesSet = knightMoves(xq, yq, a, b);
            knightMovesSet.retainAll(queenMovesSet);
            System.out.println(knightMovesSet.size());
        }
        sc.close();

    }

    private static Set<String> knightMoves(int x, int y, int a, int b) {
        Set<String> moves = new HashSet<>();
        int[][] dirs = { { a, b }, { -a, b }, { a, -b }, { -a, -b }, { b, a }, { -b, a }, { b, -a }, { -b, -a } };
        for (int[] d : dirs)
            moves.add((x + d[0]) + "," + (y + d[1]));
        return moves;
    }
}
