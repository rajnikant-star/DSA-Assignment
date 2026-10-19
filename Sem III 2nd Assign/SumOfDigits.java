import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n, int add){
        if(n==0){
            return add;
        }
        add += n%10;
        return sum(n/10,add);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n,0));
    }
}
