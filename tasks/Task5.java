import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() { return name; }
    public int getMarks() { return marks; }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(sc.next(), sc.nextInt()));
        }
        int k = sc.nextInt();

        String result = students.stream()
                .sorted(Comparator.comparingInt(Student::getMarks).reversed()
                        .thenComparing(Student::getName))
                .limit(k)
                .map(Student::getName)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}