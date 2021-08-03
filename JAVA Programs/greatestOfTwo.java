import javax.xml.namespace.QName;

public class greatestOfTwo {
    public static void main(String arg[]) {

        int arr[] = { 1, 9, 3, 4, 5, 6 };
        int i = 0, temp = arr[0], firstgreat, temp2;

        for (i = 0; i <= 4; i++) {
            if (temp < arr[i + 1]) {
                temp = arr[i + 1];
            }
        }

        firstgreat = temp;
        temp = arr[0];

        for (i = 0; i <= 4; i++) {
            if (temp < arr[i + 1]) {
                temp2 = temp;
                temp = arr[i + 1];
                if (temp == firstgreat) {
                    temp = temp2;
                }
                // System.out.println("9 == 9");
            }
        }

        System.out.println("greatest number in array is " + firstgreat + " and " + temp);
    }

}