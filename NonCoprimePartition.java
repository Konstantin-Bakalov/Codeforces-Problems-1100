import java.util.Scanner;

// codeforces.com/problemset/problem/1038/B

public class NonCoprimePartition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n <= 2) System.out.println("No");
        else {
            System.out.println("Yes");
            System.out.println("1 " + n);
            System.out.print(n - 1);
            for(int i = 1; i < n; i++) System.out.print(" " + i);
        }
    }
}