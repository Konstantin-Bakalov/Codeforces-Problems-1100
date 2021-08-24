import java.util.Scanner;

// codeforces.com/problemset/problem/877/A

public class AlexAndBrokenContest {

    public static int contains(String str, String name) {
        int br = 0, k = 0, count = 0;
        for(int i = 0; i <= str.length() - name.length(); i++) {
            for(int j = 0; j < name.length(); j++) {
                if(str.charAt(i + j) != name.charAt(k++)) {
                    count = 0;
                    k = 0;
                    break;
                }
                else count++;
            }
            if(count == name.length()) {
                count = 0;
                k = 0;
                br++;
            }
        }
        return br;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String[] a = new String[]{"Danil", "Olya", "Slava", "Ann", "Nikita"};
        int res = 0;
        for(int i = 0; i < a.length; i++) {
            res += contains(str, a[i]);
        }
        System.out.println(res == 1 ? "YES" : "NO");
    }
}