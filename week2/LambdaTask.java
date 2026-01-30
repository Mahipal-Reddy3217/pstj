import java.util.*;
import java.util.function.*;

interface PerformOperation {
    boolean check(int a);
}

public class LambdaTask {
    
    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a <= 1) return false;
            if (a == 2) return true;
            if (a % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(a); i += 2) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    // Method to return lambda for palindrome check
    public static PerformOperation isPalindrome() {
        return (int a) -> {
            String s = String.valueOf(a);
            return new StringBuilder(s).reverse().toString().equals(s);
        };
    }

    public static void checker(PerformOperation p, int num) {
        boolean result = p.check(num);
        if (p == isOdd()) {
            System.out.println(result ? "ODD" : "EVEN");
        } else if (p == isPrime()) {
            System.out.println(result ? "PRIME" : "COMPOSITE");
        } else if (p == isPalindrome()) {
            System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();
            PerformOperation op;
            switch (choice) {
                case 1: op = isOdd(); break;
                case 2: op = isPrime(); break;
                case 3: op = isPalindrome(); break;
                default: continue;
            }
            checker(op, num);
        }
        sc.close();
    }
}