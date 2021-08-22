import java.util.Scanner;

// codeforces.com/problemset/problem/987/B

public class HighSchoolBecomeHuman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(x == y || x + y == 6) System.out.println("=");
        else {
            double xx = Math.log(x) * y;
            double yy = Math.log(y) * x;
            System.out.println(xx > yy ? '>' : '<');
        }
    }
}
