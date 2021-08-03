import java.util.Scanner;

public class anagram {

    static char[] sortString(char k[], int s1) {

        for (int i = 0; i < s1 - 1; i++) {
            for (int j = i + 1; j < s1; j++) {
                if (k[i] > k[j]) {
                    char c = k[i];
                    k[i] = k[j];
                    k[j] = c;
                }
            }
        }
        return k;
    }

    static void checkanagram(char a[], char b[], int s1) {

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s1; i++) {
            if (a[i] == b[i]) {
                count1++;
            } else {
                count2++;
            }
        }

        if (count1 != 0 && count2 == 0) {
            System.out.println(" -----------Given strings are anagram of each other--------------- ");
        } else {
            System.out.println(" -----------Given strings are not anagram of each other--------------- ");
        }

    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String s1 = new String(sc.nextLine());
        System.out.print("Enter Second string : ");
        String s2 = new String(sc.nextLine());

        int size1 = s1.length();

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        if (s1.length() == s2.length()) {
            a = sortString(a, size1);
            b = sortString(b, size1);

            System.out.println("----------------- After sorting strings ----------------------");

            System.out.println(a);
            System.out.println(b);

            checkanagram(a, b, size1);
        } else {
            System.out.println("Given Strings are not anagram");
        }
    }

}
