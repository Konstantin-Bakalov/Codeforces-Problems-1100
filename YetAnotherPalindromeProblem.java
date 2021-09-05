import java.util.HashMap;
import java.util.Scanner;

// codeforces.com/contest/1324/problem/B

public class YetAnotherPalindromeProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0) {
            int n = s.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            boolean b = false;
            for(int i = 0; i < n; i++) {
                int d = s.nextInt();
                if(map.containsKey(d) && Math.abs(map.get(d) - i) >= 2) {
                    b = true;
                }
                else if(!map.containsKey(d)) map.put(d, i);
            }
            System.out.println(b ? "YES" : "NO");
        }
    }
}