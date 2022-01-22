import java.io.*;

class solution1 {

    static void reversearray(int[] s) {
        for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            int tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }

    static void printarray(int s[]) {
        for (int i = 0; i < s.length; i++)
            System.out.print(s[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 10, 22, 15, 226 };
        printarray(arr);
        reversearray(arr);
        System.out.println("Reversed array is ");
        printarray(arr);
    }
}