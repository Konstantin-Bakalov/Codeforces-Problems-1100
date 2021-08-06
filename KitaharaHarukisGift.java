import java.util.Scanner;

// codeforces.com/problemset/problem/433/A

public class KitaharaHarukisGift {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int one = 0, two = 0;
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if(a[i] == 100) one++;
            else two++;
        }
        if((one + 2 * two) % 2 == 1) System.out.println("NO");
        else if(one % 2 == 0 && one > 0 || (two % 2 == 0 && one == 0)) System.out.println("YES");
        else System.out.println("NO");
    }
}