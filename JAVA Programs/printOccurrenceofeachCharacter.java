import java.util.*;

class occurence {

    String s1 = "";
    char s[] = new char[s1.length()];
    char temp;
    int count = 0, r = 0;

    occurence() {
        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        this.s1 = sc.nextLine();
        s = s1.toCharArray();
    }

    void countOccur() {

        if (s1.length() == 0) {
            System.out.println("------------------ NO CHARACTERS FOUND ------------ ");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                temp = s[i];

                for (int j = i; j < s1.length(); j++) {

                    r = j;
                    // System.out.println(r);
                    // System.exit(0);

                    while (r >= 1) {
                        if (temp == s[--r]) {
                            System.out.println("already occured");
                        }
                    }

                    if (temp == s[j]) {
                        count++;
                    }
                    if (j == s1.length() - 1) {
                        System.out.println(" Occurrence of " + temp + " is " + count);
                    }
                }
                count = 0;
            }

        }
    }
}

public class printOccurrenceofeachCharacter {
    public static void main(String arg[]) {

        try {
            occurence c1 = new occurence();
            c1.countOccur();
        } catch (NullPointerException nc) {
            System.out.println("null pointer exception caught");
        }

    }

}
