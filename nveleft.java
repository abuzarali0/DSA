import java.util.*;
class nve1side
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x[]= new int[20];
        System.out.println("Enter the number of values");
        int n=sc.nextInt();
        System.out.println("Enter the values");
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();
        int i,j;
        i=0;
        j=0;
        for(j=0;j<n;j++)
        {
            if(x[j]<0)
            {
                int temp=x[i];
                x[i]=x[j];
                x[j]=temp;
                i++;

        } 
    }
        
        for(int d=0;d<n;d++)
        {
            System.out.print(x[d]);
        }
    }
}

      

