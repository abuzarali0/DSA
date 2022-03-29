import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class longestsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int count = 1;
        int max = 1;
        for (int i = 0; i < n - 1; i++) {
            if ((x[i]) == x[i + 1]) {
                continue;
            }
            if ((x[i]+1) == x[i+1]) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
