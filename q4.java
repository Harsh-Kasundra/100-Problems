import java.util.Scanner;

/**
 * q4
 * WAP to find a factorial of a given integer (iterative and recursive)
 */
public class q4 {
    // iterative
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact *= i;
    // }
    // System.out.println("Factorial is : " + fact);
    // sc.close();
    // }

    // recursive
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial is : " + ans);
        sc.close();
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}