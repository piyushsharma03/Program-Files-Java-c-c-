public class armstrong {
    public static void main(String arg[]) {

        int a = 156, check = a;
        int b, sum = 0;

        while (a != 0) {
            b = a % 10;
            sum = (b * b * b) + sum;
            a = a / 10;
        }

        if (sum == check) {
            System.out.println("No. is armstrong");
        } else {
            System.out.println("No. is not  armstrong ");
        }

    }
}
