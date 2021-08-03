import java.util.*;

public class fibonnaci {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int fib = sc.nextInt();
        int prev = 0, curr = 1, next, i = 0;

        while (i <= fib) {
            next = prev + curr;
            System.out.print(prev + "\t");
            prev = curr;
            curr = next;
            i++;
        }
    }
}
