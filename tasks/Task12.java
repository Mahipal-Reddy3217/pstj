import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            int count = 1;
            while (i + 1 < n && s.charAt(i + 1) == current) {
                count++;
                i++;
            }
            sb.append(current).append(Integer.toHexString(count));
        }
        System.out.println(sb.reverse().toString());
    }
}