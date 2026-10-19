import java.util.Scanner;

public class BinarySearchRecursion {

    public static int binarySearch(int[] arr, int target, int low, int high) {

        // Base case: element not found
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        // Element found
        if (arr[mid] == target) {
            return mid;
        }

        // Search left half
        if (target < arr[mid]) {
            return binarySearch(arr, target, low, mid - 1);
        }

        // Search right half
        return binarySearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}