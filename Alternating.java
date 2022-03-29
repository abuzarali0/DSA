import java.util.*;
public class Alternating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        arrange (a);
    }
    public static void arrange(int[]a)
    {
    for(int i=0;i<a.length;i++)
    {
        for(int j=i;j<a.length;j++)
            {
            if((a[j]<0&&i%2!=0)||(a[j]>=0&&i%2==0))
        {
                if(i!=j)
            {
                 rotate(a, i, j);
            }
            break;
        }
    }
}
      for(int i=0;i<a.length;i++)
      {
        System.out.print(a[i]+"  ");
      }    
    
}
    public static void rotate(int[] a,int i,int j)
    {
        int temp=a[j];
        for(int k=j;k>i;k--)
        {
            a[k]=a[k-1];
        }
    a[i]=temp;
    }
}
