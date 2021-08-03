import java.util.*;

class checkduplicate {

    StringTokenizer st = new StringTokenizer("My name name is piyush", " ");
    String s = new String();
    String temp = new String();
    String[] s1 = new String[st.countTokens()];
    int i = 0, count = 0, k = 0, count2;

    void check() {

        while (st.hasMoreTokens()) {
            // System.out.print(st.nextToken() + " ");
            s1[i] = st.nextToken();
            i++;
            count++;
        }

        printString();
        System.out.println("");
        System.out.println("\n----------------------- Duplicate strings are ---------------------\n");
        i = 0;
        while (i < count - 1) {
            for (int j = i + 1; j < count; j++) {
                if (s1[i].equals(s1[j])) { // CHECKING STRINGS ARE EQUAL OR NOT .
                    System.out.println("duplicate string in the statement is = " + s1[i]);
                    temp = s1[i];
                    count2 = count;
                    k = i;
                    // CODE FOR REMOVING STRINGS.
                    while (k < count - 1) {
                        s1[k] = s1[k + 1];
                        count2--;
                        k++;
                    }
                }
            }
            i++;
        }
    }

    void printString() {
        i = 0;
        while (i < count) {
            System.out.print(s1[i] + " ");
            i++;
        }
    }
}

public class checkduplicatesstring {
    public static void main(String arg[]) {

        checkduplicate cd = new checkduplicate();
        // cd.printString();
        cd.check();
        cd.printString();
    }

}
