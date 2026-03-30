import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        String text = "forxxorfxdofr";
        String pattern = "for";
        System.out.println(countAnagrams(text, pattern));
    }

    public static int countAnagrams(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        if (m > n) return 0;

        int[] pCount = new int[26];
        int[] tCount = new int[26];
        for (char c : pattern.toCharArray()) pCount[c - 'a']++;

        int count = 0;
        for (int i = 0; i < n; i++) {
            tCount[text.charAt(i) - 'a']++;
            if (i >= m) tCount[text.charAt(i - m) - 'a']--;
            if (i >= m - 1 && Arrays.equals(pCount, tCount)) count++;
        }
        return count;
    }
}