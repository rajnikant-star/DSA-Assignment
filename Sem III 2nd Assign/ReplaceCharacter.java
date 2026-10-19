import java.util.Scanner;

public class ReplaceCharacter {

    public static String replaceChar(String str, char oldChar, char newChar) {
        // Base case
        if (str.length() == 0) {
            return "";
        }

        char current = str.charAt(0);

        if (current == oldChar) {
            return newChar + replaceChar(str.substring(1), oldChar, newChar);
        }

        return current + replaceChar(str.substring(1), oldChar, newChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);

        System.out.println("Result: " +
                replaceChar(str, oldChar, newChar));

        sc.close();
    }
}