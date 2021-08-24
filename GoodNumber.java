import java.util.Scanner;

// codeforces.com/problemset/problem/365/A

public class GoodNumber {

    public static boolean isGood(int a, int k) {
        boolean[] b = new boolean[10];
        while(a > 0) {
            int d = a % 10;
            b[d] = true;
            a /= 10;
        }
        for(int i = 1; i <=k; i++) b[0] &= b[i];
        return b[0];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int br = 0;
        for(int i = 0; i < n; i++) {
            int a = s.nextInt();
            if(isGood(a, k)) br++;
        }
        System.out.println(br);
    }
}