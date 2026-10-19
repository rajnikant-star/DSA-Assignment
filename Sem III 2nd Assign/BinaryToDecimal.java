import java.util.Scanner;

public class BinaryToDecimal {

    public static int binaryToDecimal(int n, int power) {
        if (n == 0) {
            return 0;
        }

        int digit = n % 10;

        return digit * (int)Math.pow(2, power)
                + binaryToDecimal(n / 10, power + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Decimal = " + binaryToDecimal(n, 0));

        sc.close();
    }
}