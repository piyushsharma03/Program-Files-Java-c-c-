import java.util.*;

public class palindrome {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int check = a, s, temp = 0;

        while (a != 0) { // 123
            s = a % 10; // 3 2 1
            temp = (temp * 10) + s; // 3 30+2 = 22 320+1 = 321
            a = a / 10; // 12 1
        }

        if (temp == check) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("NOT a Palindrome");
        }

    }
}
