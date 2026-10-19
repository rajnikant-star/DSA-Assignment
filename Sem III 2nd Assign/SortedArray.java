import java.util.Scanner;

public class SortedArray {

    public static boolean isSorted(int[] arr, int index) {
        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater than next element
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Check remaining array
        return isSorted(arr, index + 1);
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

        System.out.println(isSorted(arr, 0));

        sc.close();
    }
}