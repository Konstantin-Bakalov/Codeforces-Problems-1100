import java.util.Scanner;

// codeforces.com/problemset/problem/363/B

public class Fence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        int front = 0, back = k - 1, sum = 0, minSum = 0, index = 0;
        for(int i = 0; i < k; i++) sum += a[i];
        minSum = sum;
        while(back < n - 1) {
            sum -= a[front];
            front++;
            back++;
            sum += a[back];
            if(sum < minSum) {
                minSum = sum;
                index = front;
            }
        }
        System.out.println(index + 1);
    }
}