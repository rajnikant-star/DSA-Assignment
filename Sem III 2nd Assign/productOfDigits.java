import java.util.Scanner;

public class productOfDigits {
    public static int pro(int n){
        if(n<10){
            return n;
        }
        return(n%10) *pro(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pro(n));
    }
}
