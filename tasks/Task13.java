import java.util.*;

class EntityRecord {
    int id;
    String student, course, instructor, date;
    int duration;

    EntityRecord(int id, String student, String course, String instructor, String date, int duration) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.instructor = instructor;
        this.date = date;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return String.format("Enrollment_ID: %d, Student: %s, Course: %s, Instructor: %s, Start Date: %s, Duration: %d weeks",
                id, student, course, instructor, date, duration);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        List<EntityRecord> records = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            records.add(new EntityRecord(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt()));
        }
        records.forEach(System.out::println);
    }
}