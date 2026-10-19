import java.util.Scanner;

public class MaximumElement {

    public static int findMax(int[] arr, int index) {
        // Base case
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Maximum in the remaining array
        int maxRest = findMax(arr, index + 1);

        // Compare current element with maxRest
        return Math.max(arr[index], maxRest);
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

        System.out.println("Maximum Element = " + findMax(arr, 0));

        sc.close();
    }
}