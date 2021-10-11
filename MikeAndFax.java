import java.util.Scanner;

// codeforces.com/problemset/problem/548/A

public class MikeAndFax {

    public static boolean isPalindrome(String s, int start, int end) {
        int len = end - start + 1;
        for(int i = 0; i < len / 2 + 1; i++) {
            if(s.charAt(start + i) != s.charAt(end - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int k = s.nextInt();
        if(str.length() % k != 0) System.out.println("NO");
        else {
            int len = str.length() / k;
            boolean b = true;
            for(int i = 0; i < str.length(); i += len) {
                b = b && isPalindrome(str, i, i + len - 1);
                if(!b) break;
            }
            System.out.println(b ? "YES" : "NO");
        }
    }
}