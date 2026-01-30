import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static boolean isOlderThan(Person p, int ageLimit) {
        return p.age > ageLimit;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            persons.add(new Person(input[0], Integer.parseInt(input[1])));
        }

        int ageLimit = Integer.parseInt(sc.nextLine());

        List<String> sortedNames = persons.stream()
                .map(p -> p.name)
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        List<String> olderNames = persons.stream()
                .filter(p -> Person.isOlderThan(p, ageLimit)) 
                .map(p -> p.name)
                .collect(Collectors.toList());

        List<String> upperNames = persons.stream()
                .map(p -> p.name.toUpperCase()) 
                .collect(Collectors.toList());

        System.out.println(String.join(" ", sortedNames));
        System.out.println(String.join(" ", olderNames));
        System.out.println(String.join(" ", upperNames));
    }
}