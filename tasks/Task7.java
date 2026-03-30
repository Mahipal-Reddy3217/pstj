import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        long currentSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            currentSum += arr[i];
            System.out.print(currentSum + (i == n - 1 ? "" : " "));
        }
        System.out.println();
    }
}