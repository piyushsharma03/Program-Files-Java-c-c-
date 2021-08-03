
public class printonlyoddandreverse {
    public static void main(String arg[]) {

        // char[] a = { 'p', ' ', 'i', 'y', 'u', 's', ' ', 'h', '\0' };
        String s = "MY NAME IS PIYUSH";
        int k = 1, j = 0;

        // creating character array
        char[] b = new char[s.length()];
        char[] rev = new char[20];

        // To remove all white spaces from the string .
        s = s.replaceAll("\\s", "");

        // To convert string into character array
        b = s.toCharArray();

        for (char c : b) {
            System.out.print(c);
        }

        System.out.println("");

        // Reversing string and storing it in another character array
        for (int i = s.length() - 1; i >= 0; i--) {
            while (j < k) {
                rev[j] = b[i];
                j++;
            }
            k++;
        }

        for (char r : rev) {
            System.out.print(r);
        }

        // printing character only at odd places .
        for (int i = 0; i < s.length() - 1; i++) {
            if (i % 2 != 0) {
                System.out.print(rev[i]);
            }
        }

    }

}
