class employee {

    int id;
    String name;

    employee(int id , String name){
        this.id = id;
        this.name = name;
    }

}


public class object{

    public static void main(String[] arg){
    
        employee e1 = new employee(101,"Piyush");
        employee e2 = new employee(102,"Sharma");
        employee e3 = e1;

        System.out.println(Integer.toHexString(e1.hashCode()));
        System.out.println(e2);

        String s1 = new String("hello");
        String s2 ="hy";
        String s3 = "hello";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s3); // false
        

    }

}