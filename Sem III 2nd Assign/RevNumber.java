import java.util.Scanner;

public class RevNumber {
    static int rev = 0;
    public static void rev(int n){
        if(n==0) {
            return;
        }
        int digit = n%10;
        rev = rev *10+digit;
        rev(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        rev(n);
        System.out.println(rev);
    }
}