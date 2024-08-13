import java.util.Scanner;

/**
 * q2
 * WAP to find whether string is palindrome or not.
 */
public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        if (str.equals(str2)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
        sc.close();
    }
}