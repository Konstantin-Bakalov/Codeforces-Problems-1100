import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/problemset/problem/1227/A

public class MathProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                left.add(s.nextInt());
                right.add(s.nextInt());
            }
            int l = Integer.MAX_VALUE, r = 0;
            for(int i = 0; i < n; i++)
                if(right.get(i) < l) l = right.get(i);
            for(int i = 0; i < n; i++)
                if(left.get(i) > r) r = left.get(i);
            System.out.println(Math.max(0, r - l));
        }
    }
}
