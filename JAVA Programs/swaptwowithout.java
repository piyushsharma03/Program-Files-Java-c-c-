public class swaptwowithout {

    public static void main(String arg[]) {

        int a, b;
        a = -100;
        b = 2;

        System.out.println("a =" + a);
        System.out.println("b =" + b);

        b = a + b; // 30
        a = b - a; // 30 - 10 = 20
        b = b - a; // 10

        System.out.println("----------- After swapping without using third variable -------------");

        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}