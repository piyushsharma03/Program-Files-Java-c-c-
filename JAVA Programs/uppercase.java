import java.util.Scanner;

public class uppercase {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String");
        String s = sc.nextLine();

        char s1[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            if (i >= 3 && i < s.length() - 1) {
                s1[i] = Character.toUpperCase(s1[i]);
            }
        }

        s = s1.toString(); // when we print any object to string method returs its hashcode .
        // if we want to print its specified value then we have to override tostring
        // method of object class .

        System.out.println(s); // print hashcode of object s .
        System.out.println(s1); // print desired string .

    }
}
