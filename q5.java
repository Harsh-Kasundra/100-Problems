import java.util.Scanner;

/**
 * q5
 * WAP to find a summation of a digit of a given number. (Iterative and
 * recursive)
 */
public class q5 {
    // iterative
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum = 0;
    // int temp = n;
    // for (int i = 0; i < String.valueOf(n).length(); i++) {
    // int rem = temp % 10;
    // System.out.println(rem);
    // temp = temp / 10;
    // sum = sum + rem;
    // }
    // System.out.println(sum);
    // sc.close();
    // }

    // recursive
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = digitSumation(n);
        System.out.println(ans);
        sc.close();
    }

    public static int digitSumation(int n) {
        if (String.valueOf(n).length() == 1) {
            return n;
        }
        return n % 10 + digitSumation(n / 10);
    }
}