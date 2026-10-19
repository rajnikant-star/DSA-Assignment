import java.util.Scanner;

public class RemoveCharacter {

    public static String removeChar(String str, char ch) {
        // Base case
        if (str.length() == 0) {
            return "";
        }

        char current = str.charAt(0);

        if (current == ch) {
            return removeChar(str.substring(1), ch);
        }

        return current + removeChar(str.substring(1), ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println("Result: " + removeChar(str, ch));

        sc.close();
    }
}