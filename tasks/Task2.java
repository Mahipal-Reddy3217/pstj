import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public PerformOperation isPrime() {
        return (int a) -> {
            if (a < 2) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return (int a) -> {
            String s = Integer.toString(a);
            return s.equals(new StringBuilder(s).reverse().toString());
        };
    }
}

public class Task2 {
    public static void main(String[] args) {
        MyMath ob = new MyMath();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int ch = sc.nextInt();
            int num = sc.nextInt();
            boolean res = false;
            String ans = null;
            if (ch == 1) {
                res = ob.checker(ob.isOdd(), num);
                ans = res ? "ODD" : "EVEN";
            } else if (ch == 2) {
                res = ob.checker(ob.isPrime(), num);
                ans = res ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                res = ob.checker(ob.isPalindrome(), num);
                ans = res ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(ans);
        }
    }
}