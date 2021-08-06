import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// codeforces.com/problemset/problem/362/B

public class PetyaAndStaircases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 0; i < m; i++) v.add(s.nextInt());
        Collections.sort(v);
        if(m == 0) System.out.println("YES");
        else if(v.get(0) == 1 || v.get(m - 1) == n) System.out.println("NO");
        else {
            int br = 1, max = 1;
            for(int i = 0; i < v.size() - 1; i++) {
                if(v.get(i) + 1 == v.get(i + 1)) br++;
                else {
                    if(br > max) max = br;
                    br = 1;
                }
            }
            if(br > max) max = br;
            System.out.println(max > 2 ? "NO" : "YES");
        }
    }
}