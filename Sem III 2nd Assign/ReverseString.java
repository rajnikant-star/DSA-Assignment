import java.util.Scanner;

public class ReverseString {
    public static String rev(String s){
        if(s.length()==0 || s.length()==1){
            return s;
        }
        return rev(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(rev(s));
    }
}
