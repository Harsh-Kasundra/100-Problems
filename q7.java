import java.util.Scanner;

/**
 * q7
 * WAP to find a Fibonacci series up to n terms (n is entered by user)
 * (iterative and recursive)
 */
public class q7 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int a = 0, b = 1;
    //     if (n >= 1) {
    //         System.out.println(a);
    //     }
    //     if (n >= 2) {
    //         System.out.println(b);
    //     }
    //     for (int i = 3; i <= n; i++) {
    //         int c = a + b;
    //         System.out.println(c);
    //         a = b;
    //         b = c;
    //     }
    //     sc.close();
    // }
    // Recursive method to find Fibonacci number at position n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }

        sc.close();
    }
}