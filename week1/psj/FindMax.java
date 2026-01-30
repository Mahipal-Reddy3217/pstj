public class FindMax {
    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 7, 3, 12, 5};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}