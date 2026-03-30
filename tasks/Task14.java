import java.util.*;

abstract class Vehicle {
    int id;
    String model;
    double baseRent;

    Vehicle(int id, String model, double baseRent) {
        this.id = id;
        this.model = model;
        this.baseRent = baseRent;
    }
    abstract double calculateRent();
}

class Car extends Vehicle {
    int seats;
    Car(int id, String model, double baseRent, int seats) {
        super(id, model, baseRent);
        this.seats = seats;
    }
    double calculateRent() { return baseRent + (seats * 100); }
}

class Bike extends Vehicle {
    int capacity;
    Bike(int id, String model, double baseRent, int capacity) {
        super(id, model, baseRent);
        this.capacity = capacity;
    }
    double calculateRent() { return baseRent + (capacity * 2); }
}

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        List<Vehicle> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equals("C")) list.add(new Car(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt()));
            else list.add(new Bike(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt()));
        }
        for (Vehicle v : list) {
            System.out.printf("Vehicle ID: %d, Model: %s, Total Rent: %.1f\n", v.id, v.model, v.calculateRent());
        }
    }
}