import java.util.*;

class Merge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        int j = 0;
        for (int i = 0; i < m; i++) {

            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[i];
                arr1[i] = temp;
                Arrays.sort(arr2);
            }

        }
        for (int i = 0; i < m; i++)
            System.out.print(arr1[i]);
        for (int i = 0; i < n; i++)
            System.out.print(arr2[i]);
        in.close();
    }
}