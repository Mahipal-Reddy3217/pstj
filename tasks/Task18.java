import java.util.*;

class Account {
    int id;
    String name;
    double balance;

    Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
}

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        Map<Integer, Account> accounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            accounts.put(id, new Account(id, sc.next(), sc.nextDouble()));
        }

        if (!sc.hasNextInt()) return;
        int ops = sc.nextInt();
        while (ops-- > 0) {
            String type = sc.next();
            int id = sc.nextInt();
            if (!accounts.containsKey(id)) {
                if (type.equals("TRANSFER")) sc.nextInt();
                sc.nextDouble();
                System.out.println("Account not found");
                continue;
            }
            Account acc = accounts.get(id);

            if (type.equals("DEPOSIT")) {
                double amt = sc.nextDouble();
                acc.balance += amt;
                System.out.println("Deposited " + (int)amt + " to " + acc.name);
            } else if (type.equals("WITHDRAW")) {
                double amt = sc.nextDouble();
                if (acc.balance >= amt) {
                    acc.balance -= amt;
                    System.out.println("Withdrawn " + (int)amt + " from " + acc.name);
                } else System.out.println("Insufficient balance");
            } else if (type.equals("TRANSFER")) {
                int targetId = sc.nextInt();
                double amt = sc.nextDouble();
                if (!accounts.containsKey(targetId)) System.out.println("Account not found");
                else if (acc.balance < amt) System.out.println("Insufficient balance");
                else {
                    acc.balance -= amt;
                    accounts.get(targetId).balance += amt;
                    System.out.println("Transferred " + (int)amt + " from " + acc.name + " to " + accounts.get(targetId).name);
                }
            }
        }
    }
}