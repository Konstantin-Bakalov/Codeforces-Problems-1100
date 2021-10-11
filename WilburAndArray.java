import java.util.Scanner;

// codeforces.com/problemset/problem/596/B

public class WilburAndArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++) b[i] = s.nextInt();
        long res = Math.abs(b[0]);
        for(int i = 1; i < n; i++)
            res += Math.abs(b[i] - b[i - 1]);
        System.out.println(res);
    }
}