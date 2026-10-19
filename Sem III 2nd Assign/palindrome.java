import java.util.Scanner;

public class palindrome {
    public static boolean palindrome(String s) {
        return helper(s,0,s.length()-1);
    }
    public static boolean helper(String s,int s1,int e){
        if(s1>=e){
            return true;
        }
        if(s.charAt(s1) != s.charAt(e)){
            return false;
        }
        return helper(s,s1+1,e-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(palindrome(s)){
            System.out.println("palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}
