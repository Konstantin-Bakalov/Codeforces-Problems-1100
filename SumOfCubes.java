import java.util.HashSet;
import java.util.Scanner;

// codeforces.com/problemset/problem/1490/C

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        HashSet<Long> set = new HashSet<>();
        long N = (long) 1e12;
        for(long i = 1; i * i * i <= N; i++) set.add(i * i * i);
        while(t-- > 0) {
            long x = s.nextLong();
            boolean b = false;
            for(long i = 1; i * i * i <= x; i++) {
                if(set.contains(x - i * i * i)) {
                    b = true;
                    break;
                }
            }
            System.out.println(b ? "YES" : "NO");
        }
    }
}