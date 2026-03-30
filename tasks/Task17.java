import java.util.*;

class InsufficientStockException extends Exception {
    public InsufficientStockException(String msg) { super(msg); }
}

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int req = sc.nextInt();
            int stock = sc.nextInt();
            try {
                if (req > stock) throw new InsufficientStockException("Insufficient stock");
                System.out.println("Order " + id + " processed successfully");
            } catch (InsufficientStockException e) {
                System.out.println("Order " + id + " failed: " + e.getMessage());
            }
        }
    }
}