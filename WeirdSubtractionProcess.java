import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/problemset/problem/946/B

public class WeirdSubtractionProcess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n = s.nextBigInteger();
        BigInteger m = s.nextBigInteger();
        while(true) {
            if(n == BigInteger.ZERO || m == BigInteger.ZERO) break;
            if (n.compareTo(m.multiply(BigInteger.valueOf(2))) >= 0) {
                n = n.mod(m.multiply(BigInteger.TWO));
            }
            else if (m.compareTo(n.multiply(BigInteger.valueOf(2))) >= 0) {
                m = m.mod(n.multiply(BigInteger.TWO));
            }
            else break;
        }
        System.out.println(n + " " + m);
    }
}