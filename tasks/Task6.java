import java.util.*;

class Sale {
    String category, item;
    int amount;
    Sale(String category, String item, int amount) {
        this.category = category;
        this.item = item;
        this.amount = amount;
    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> totalSales = new LinkedHashMap<>();
        Map<String, String> topItem = new HashMap<>();
        Map<String, Integer> maxAmount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String cat = sc.next();
            String item = sc.next();
            int amt = sc.nextInt();

            totalSales.put(cat, totalSales.getOrDefault(cat, 0) + amt);
            
            if (amt > maxAmount.getOrDefault(cat, -1)) {
                maxAmount.put(cat, amt);
                topItem.put(cat, item);
            }
        }

        totalSales.forEach((cat, total) -> {
            System.out.println(cat + " " + total + " " + topItem.get(cat));
        });
    }
}