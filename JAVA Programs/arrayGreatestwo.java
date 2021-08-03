
class show {

    int x = 100;

    show() {
        System.out.println("this is constructor");
    }

    void hello() {
        System.out.println(" This is " + x + " class");
    }

    {
        System.out.println("block");
    }

    static {
        System.out.println("static block");
    }
}

class demo {
    public static void main(String arg[]) {
        show j = new show();
    }
}