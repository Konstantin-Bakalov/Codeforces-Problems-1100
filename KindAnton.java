import java.util.Scanner;

// codeforces.com/problemset/problem/1333/B

public class KindAnton {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++) a[i] = s.nextInt();
            for(int i = 0; i < n; i++) b[i] = s.nextInt();
            int firstOne = -1, firstMinusOne = -1;
            for(int i = 0; i < n; i++) {
                if(a[i] == 1 && firstOne == -1) firstOne = i;
                if(a[i] == -1 && firstMinusOne == - 1) firstMinusOne = i;
            }
            boolean bb = false;
            for(int i = 0; i < n; i++) {
                if((a[i] == b[i]) || (a[i] < b[i] && firstOne >= 0 && firstOne < i) || (a[i] > b[i] && firstMinusOne >= 0 &&  firstMinusOne < i)) {
                    bb = true;
                }
                else {
                    bb = false;
                    break;
                }
            }
            System.out.println(bb ? "YES" : "NO");
        }
    }
}