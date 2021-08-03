
// method hiding is an example of compile time polymorphism while method overriding is an example of runtime polymoriphsm
// Means in the case of method hiding or in static methods method will be invoked corresponding to the reference variable and vice versa
// Method hiding can be done only by static methods while method overloading only done by instance methods . 

class demo1 {

    static final int x;

    static {
        x = 100;
    }

    void show() {
        System.out.println("x = " + x);
    }

}

public class method_hiding {
    public static void main(String arg[]) {
        demo1 d = new demo1();
        d.show();
    }
}
