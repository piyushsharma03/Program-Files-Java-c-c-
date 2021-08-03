// To create only limited object of a class and only one if required we use 
// singleton class 

class demo {

    static  demo a; 
    private demo(){ // private constructor

    }

    public static demo getInstance() {  // Factory Method
         if( a == null ){            
           a = new demo();
           return a;
        }    
        return a;
    }
}

public class singleton {

    public static void main(String... arg){
        demo a =  demo.getInstance();
        System.out.println(a.hashCode());
        demo a1 =  demo.getInstance();
        System.out.println(a1.hashCode());
    }

}