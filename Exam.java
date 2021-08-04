import java.util.Scanner;

// codeforces.com/problemset/problem/534/A

public class Exam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 1) {
            System.out.println(1);
            System.out.println(1);
        }
        else if(n == 2) {
            System.out.println(1);
            System.out.println(1);
        }
        else if(n == 3) {
            System.out.println(2);
            System.out.println("3 1");
        }
        else {
            System.out.println(n);
            int a = n % 2 == 0 ? n - 1 : n;
            System.out.print(a);
            for (int i = a - 2; i >= 1; i -= 2) System.out.print(" " + i);
            int b = n % 2 == 0 ? n : n - 1;
            System.out.print(" " + b);
            for (int i = b - 2; i >= 2; i -= 2) System.out.print(" " + i);
        }
    }
}