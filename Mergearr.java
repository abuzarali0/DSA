import java.util.*;
class Mergearr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x[]= new int[20];
        int a[]= new int[20];
        System.out.println("Enter the number of values for both arrays");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<m;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();

}
