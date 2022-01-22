import java.util.*;
class rotate1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x[]= new int[20];
        System.out.println("Enter the number of values");
        int n=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int temp=x[n-1];
        for(int i=n-1;i>0;i--)
        {
        x[i]=x[i-1];
        }
        x[0]=temp;
        for(int i=0;i<n;i++)
       {System.out.print(x[i]);}
}
}
