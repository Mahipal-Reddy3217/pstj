import java.util.*;

interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {
    public void sendNotification(String m) { System.out.println("Sent Email notification: " + m); }
}

class SMSNotification implements Notification {
    public void sendNotification(String m) { System.out.println("Sent SMS notification: " + m); }
}

class PushNotification implements Notification {
    public void sendNotification(String m) { System.out.println("Sent Push notification: " + m); }
}

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String msg = sc.next();
            Notification ntf = switch (type) {
                case "E" -> new EmailNotification();
                case "S" -> new SMSNotification();
                default -> new PushNotification();
            };
            ntf.sendNotification(msg);
        }
    }
}