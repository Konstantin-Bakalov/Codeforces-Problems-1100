import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/1360/C

public class SimilarPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            ArrayList<Integer> v = new ArrayList<>();
            for(int i = 0; i < n; i++) v.add(s.nextInt());
            Collections.sort(v);
            int odd = 0, even = 0, diff = 0;
            for(int i = 0; i < n; i++) {
                if(v.get(i) % 2 == 0) even++;
                else odd++;
            }
            for(int i = 0; i < n - 1; i++)
                if(v.get(i + 1) - v.get(i) == 1) diff++;
            while(even % 2 != 0 && odd % 2 != 0) {
                if(diff == 0) break;
                even--;
                odd--;
                diff--;
            }
            if(even % 2 == 0 && odd % 2 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}