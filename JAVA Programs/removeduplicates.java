class checkandremove {

    char s[], c;
    char s1[] = new char[20];
    int ascii, len, temp;
    int j = 0;

    checkandremove(String s) {
        this.s = s.toCharArray();
        this.len = s.length();
    }

    void sort() {

        for (int i = 0; i < len - 1; i++) {
            temp = s[i];
            for (int j = i + 1; j < len; j++) {
                ascii = s[j];
                if (temp > ascii) {
                    c = s[i];
                    s[i] = s[j];
                    s[j] = c;
                }
            }
        }
    }

    void printString() {
        int i = 0;
        while (i < len) {
            System.out.print(s[i]);
            i++;
        }
        System.out.println("");
    }

    void remove(int i) {
        while (i < len - 1) {
            ascii = s[i + 1];
            temp = s[i];
            if (ascii != temp) {
                System.out.println(s[i + 1] + " != " + s[i]);
                s1[j] = s[i];
                System.out.println(s[j]);
                j++;
            }
            ++i;
        }
    }

    void printStr() {
        int i = 0;
        while (i < j) {
            System.out.print(s[j]);
            i++;
        }
    }

}

public class removeduplicates {
    
    public static void main(String[] arg) {

        checkandremove cr = new checkandremove("geeksforgeeks");
        // cr.printString();
        cr.sort();
        cr.sort();
        cr.printString();
        cr.remove(0);
        cr.printStr();
    }
}
