import java.util.*;

abstract class Payment {
    abstract String processPayment(double amount);
}

class CreditCardPayment extends Payment {
    String processPayment(double amount) {
        return String.format("Processed CreditCard payment: Total Amount = %.2f", amount * 1.02);
    }
}

class PayPalPayment extends Payment {
    String processPayment(double amount) {
        return String.format("Processed PayPal payment: Total Amount = %.2f", amount + 1.50);
    }
}

class UPIPayment extends Payment {
    String processPayment(double amount) {
        return String.format("Processed UPI payment: Total Amount = %.2f", amount);
    }
}

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amt = sc.nextDouble();
            Payment p = switch (type) {
                case "C" -> new CreditCardPayment();
                case "P" -> new PayPalPayment();
                default -> new UPIPayment();
            };
            System.out.println(p.processPayment(amt));
        }
    }
}