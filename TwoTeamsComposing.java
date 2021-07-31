import java.util.Scanner;

// codeforces.com/problemset/problem/1335/C

public class TwoTeamsComposing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n + 1];
            for(int i = 0; i < n; i++) a[s.nextInt()]++;
            int distinct = 0, same = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] >= 1) distinct++;
                if(a[i] >= 1 && a[i] > same) same = a[i];
            }
            if(!(distinct > same)) same--;
            System.out.println(distinct >= same ? same : distinct);
        }
    }
}