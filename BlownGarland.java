import java.util.Scanner;

// codeforces.com/problemset/problem/758/B

public class BlownGarland {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] a = str.toCharArray();
        int r = 0, g = 0, b = 0, y = 0;
        int firstRed = -1, firstGreen = -1, firstBlue = -1, firstYellow = -1;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == 'R' && firstRed < 0) firstRed = i % 4;
            else if(a[i] == 'G' && firstGreen < 0) firstGreen = i % 4;
            else if(a[i] == 'B' && firstBlue < 0) firstBlue = i % 4;
            else if(a[i] == 'Y' && firstYellow < 0) firstYellow = i % 4;
        }
        for(int i = 0; i < a.length; i++) {
            if(a[i] == '!') {
                if(i % 4 == firstRed) {
                    a[i] = 'R';
                    r++;
                }
                else if(i % 4 == firstBlue) {
                    a[i] = 'B';
                    b++;
                }
                else if(i % 4 == firstGreen) {
                    a[i] = 'G';
                    g++;
                }
                else if(i % 4 == firstYellow) {
                    a[i] = 'Y';
                    y++;
                }
            }
        }
        System.out.println(r + " " + b + " " + y + " " + g);
    }
}