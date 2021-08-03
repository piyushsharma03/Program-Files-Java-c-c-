import java.util.*;

public class perfectno {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any number to check whether it is perfect or not");

        int x = sc.nextInt();
        int a, sum = 0, constx = x;
        int fact = 1;

        System.out.println(x);

        while (x != 0) {

            a = x % 10;
            while (a != 0) {
                fact = fact * a;
                a--;
            }
            sum = sum + fact;
            x = x / 10;
            fact = 1;
        }

        if (sum == constx) {
            System.out.println("This no. is strong no.");
        } else {
            System.out.println("This no. is not a strong no.");
        }
    }

}