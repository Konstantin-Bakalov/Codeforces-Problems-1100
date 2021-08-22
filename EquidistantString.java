import java.util.Scanner;

// codeforces.com/problemset/problem/545/B

public class EquidistantString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        char[] p = new char[a.length];
        boolean bb = true;
        int br = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == b[i]) {
                p[i] = a[i];
                continue;
            }
            if(bb) {
                p[i] = a[i] == '1' ? '0' : '1';
                bb = !bb;
                br++;
            }
            else {
                p[i] = b[i] == '1' ? '0' : '1';
                bb = !bb;
                br++;
            }
        }
        if(br % 2 == 1) System.out.println("impossible");
        else for(char c : p) System.out.print(c);
    }
}
