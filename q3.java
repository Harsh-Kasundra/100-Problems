import java.util.Scanner;

/**
 * q3
 * WAP to find a Factor of a given number (iterative and recursive)
 */
public class q3 {
    // iterative
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // System.out.println(i);
    // }
    // }
    // sc.close();
    // }

    // recursive
    public static void findFactors(int number, int divisor) {
        if (divisor > number) {
            return;
        }
        if (number % divisor == 0) {
            System.out.println(divisor);
        }
        findFactors(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        findFactors(number, 1); // Start with divisor 1
        sc.close();
    }
}