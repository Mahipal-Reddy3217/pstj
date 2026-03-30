import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Event {
    String name;
    LocalDate date;

    Event(String name, String dateStr) {
        this.name = name;
        this.date = LocalDate.parse(dateStr);
    }
    public String getName() { return name; }
    public LocalDate getDate() { return date; }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new Event(sc.next(), sc.next()));
        }
        int targetMonth = sc.nextInt();

        List<Event> sorted = events.stream()
                .sorted(Comparator.comparing(Event::getDate))
                .collect(Collectors.toList());
        System.out.println(sorted.stream().map(Event::getName).collect(Collectors.joining(" ")));

        System.out.println(sorted.get(0).getName());
        System.out.println(sorted.get(sorted.size() - 1).getName());

        System.out.println(events.stream()
                .filter(e -> e.getDate().getMonthValue() == targetMonth)
                .map(Event::getName)
                .collect(Collectors.joining(" ")));
    }
}