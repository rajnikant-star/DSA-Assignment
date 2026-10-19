import java.util.Scanner;

public class MinimunElement {

    public static int findMin(int[] arr, int index) {
        // Base case
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Minimum in the remaining array
        int minRest = findMin(arr, index + 1);

        // Compare current element with minRest
        return Math.min(arr[index], minRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum Element = " + findMin(arr, 0));

        sc.close();
    }
}