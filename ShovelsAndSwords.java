import java.util.Scanner;

// codeforces.com/problemset/problem/1366/A

public class ShovelsAndSwords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(Math.min(Math.min(a, b), (a + b) / 3));
        }
    }
}