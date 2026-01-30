import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] parts = sc.nextLine().split(" ");
            String name = parts[0];
            int marks = Integer.parseInt(parts[1]);
            students.add(new Student(name, marks));
        }

        int K = Integer.parseInt(sc.nextLine());

        String result = students.stream()
                .sorted(Comparator.comparingInt((Student s) -> s.marks).reversed()
                        .thenComparing(s -> s.name))
                .limit(K)
                .map(s -> s.name)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}