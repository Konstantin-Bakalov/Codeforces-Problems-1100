import java.util.Scanner;

// codeforces.com/problemset/problem/1119/A

public class IlyaAndAColorfulWalk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        int index1 = 0, index2 = n - 1;
        while(a[index1] == a[n - 1]) index1++;
        while(a[index2] == a[0]) index2--;
        int one = n - index1 - 1;
        int two = index2;
        System.out.println(one > two ? one : two);
    }
}