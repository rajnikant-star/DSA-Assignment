import java.util.Scanner;

public class LinearSearch {

    public static int search(int[] arr, int target, int index) {
        // Base case: element not found
        if (index == arr.length) {
            return -1;
        }

        // Element found
        if (arr[index] == target) {
            return index;
        }

        // Search in remaining array
        return search(arr, target, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int result = search(arr, target, 0);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}