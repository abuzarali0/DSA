import java.util.*;
import java.lang.*;
class lcs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x[]= new int[20];
        System.out.println("Enter the number of values");
        int n=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int cur=0;
        int max=x[0];
        for(int i=0;i<n;i++)
        {
            if(x[i]<0)
            {
                cur=x[i];
            }
            else{
            cur=cur+x[i];
        }
        max=Math.max(cur, max);
    }
        System.out.println("Value is "+ max);
    }
}