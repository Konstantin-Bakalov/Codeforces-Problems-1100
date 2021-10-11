import java.util.Scanner;

// codeforces.com/problemset/problem/779/B

public class WeirdRounding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int zeroes = 0, deleted = 0, copy = n;
        while(n > 0) {
            int d = n % 10;
            if(d == 0) zeroes++;
            else deleted++;
            if(zeroes == k) break;
            n /= 10;
        }
        if(copy == 0) System.out.println(0);
        else if(zeroes != k) System.out.println(deleted + zeroes - 1);
        else System.out.println(deleted);
    }
}