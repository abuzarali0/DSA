import java.util.*;
import java.lang.Math;

class Kadane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int cur_sum = 0;
        int max_sum = a[0];
        for (int i = 0; i < n; i++) {

            if (cur_sum < 0) {
                cur_sum = a[i];
            } else {
                cur_sum = cur_sum + a[i];
            }
            max_sum = Math.max(max_sum, cur_sum);

        }
        System.out.println(max_sum);
        in.close();
    }
}
