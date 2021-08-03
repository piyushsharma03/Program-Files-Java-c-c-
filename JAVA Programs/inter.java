interface inter1 {
    void show();
}

abstract class abs {

    int a = 10;
    int b = 20;

    void show2() {
        System.out.println("sum = " + (a + b));
    }

    abstract void show3();
}

class A extends abs implements inter1 {

    public void show() {
        System.out.println("interface method");
    }

    void show3() {
        System.out.println("abstarct method");
    }
}

public class inter {
    public static void main(String... arg) {
        A a = new A();
        a.show();
        a.show2();
        a.show3();
        System.out.println("helo");
    }
}
