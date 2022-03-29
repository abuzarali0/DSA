import java.util.*;

class inversioncount {
    static int count=0;
    public static int mergesort (int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high){
            int c1;
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            c1=merge(arr, low, mid, high);
            return c1;
        }
        return 0;
    }
    public static int merge(int arr[], int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;

        int lt[] = new int[n1];
        int rt[] = new int[n2];
        for (int i = 0; i < n1; i++)
            lt[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            rt[j] = arr[m + 1 + j];
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (lt[i] <= rt[j]) {
                arr[k] = lt[i];
                i++;
            } else {
                arr[k] = rt[j];
                j++;
                count=count+(n1-i);
            }
            k++;
        }
        while (i < n1) {
            arr[k] = lt[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rt[j];
            j++;
            k++;
        }
        return count;



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int len;
        len = a.length - 1;
        int c=mergesort(a, 0, len);
        for (int i = 0; i < len + 1; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.print(c);
        sc.close();
    }
}
