public class PrintPairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        System.out.println("All possible pairs:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println(); // New line after each set
        }
    }
}