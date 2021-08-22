import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/problemset/problem/869/B

public class TheEternalImmortality {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();
        BigInteger res = BigInteger.ONE;
        BigInteger ten = BigInteger.valueOf(10);
        while(b.compareTo(a) > 0) {
            BigInteger m = b.mod(ten);
            res = res.multiply(m);
            res = res.mod(ten);
            if(res.compareTo(BigInteger.ZERO) == 0) break;
            b = b.subtract(BigInteger.ONE);
        }
        System.out.println(res);
    }
}