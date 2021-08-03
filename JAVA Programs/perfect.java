import java.util.*;

public class perfect {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1, sum = 0;

        while (i < a) {
            if (a % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (sum == a) {
            System.out.println("NO. " + a + " is perfect no.");
        } else {
            System.out.println("NO. " + a + " is  not perfect no.");
        }
    }
}