import java.util.*;

public class maxprodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int prod = 1;
        int max = x[0];
        for (int i = 0; i < n; i++) {
            prod = prod * x[i];
            if (x[i] == 0) {
                prod = 1;
            }
            max = Math.max(prod, max);

        }
        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            prod = prod * x[i];
            if (x[i] == 0) {
                prod = 1;
            }
            max = Math.max(prod, max);

        }
        System.out.println("Value is " + max);
    }
}