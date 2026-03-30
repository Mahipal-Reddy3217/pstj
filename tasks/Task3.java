import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    
    public static boolean isOlderThan(Person p, int limit) {
        return p.getAge() > limit;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            persons.add(new Person(parts[0], Integer.parseInt(parts[1])));
        }
        int ageLimit = Integer.parseInt(sc.nextLine());

        // Sort alphabetically
        List<Person> sorted = new ArrayList<>(persons);
        sorted.sort(Comparator.comparing(Person::getName));
        System.out.println(sorted.stream().map(Person::getName).collect(Collectors.joining(" ")));

        // Filter using static method reference
        System.out.println(persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit))
                .map(Person::getName)
                .collect(Collectors.joining(" ")));

        // Instance method reference
        System.out.println(persons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(" ")));
    }
}