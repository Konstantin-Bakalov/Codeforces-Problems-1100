import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/problemset/problem/1409/B

public class MinimumProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int n = s.nextInt();
            BigInteger res = BigInteger.valueOf((long) 1e18);
            for(int i = 0; i < 2; i++) {
                long one = Math.min(n, a - x);
                long two = Math.min(n - one, b - y);
                BigInteger d = BigInteger.valueOf(a -one).multiply(BigInteger.valueOf(b - two));
                if(res.compareTo(d) > 0) res = d;
                int t1 = a;
                a = b;
                b = t1;
                int t2 = x;
                x = y;
                y = t2;
            }
            System.out.println(res);
        }
    }
}