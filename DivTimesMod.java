import java.util.Scanner;

// codeforces.com/problemset/problem/1085/B

public class DivTimesMod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                int m = n / i;
                int r = n / m;
                int x = m * k + r;
                if((x / k) * (x % k) == n && x < min) min = x;
            }
        }
        System.out.println(min);
    }
}