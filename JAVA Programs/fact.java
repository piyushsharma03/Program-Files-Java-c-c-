import java.util.*;

public class fact {

    static int fact = 1;

    static int factusingrec(int n) {
        if (n == 0) {
            return 1;
        } else {
            return fact = n * factusingrec(n - 1);
        }
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;

        // while (n != 0) {
        // fact = fact * n;
        // n--;
        // }

        fact = factusingrec(n);
        System.out.println("factorial of n is = " + fact);
    }

}
