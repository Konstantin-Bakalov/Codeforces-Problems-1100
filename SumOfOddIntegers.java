import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/problemset/problem/1327/A

public class SumOfOddIntegers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            if(k % 2 == n % 2) {
                BigInteger sum = BigInteger.valueOf(k).multiply(BigInteger.valueOf(k));
                if(sum.compareTo(BigInteger.valueOf(n)) > 0) System.out.println("NO");
                else System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}