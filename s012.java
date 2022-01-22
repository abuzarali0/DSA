
//dutchflagalgo
import java.util.*;
class s012
{
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int x[]= new int[20];
       System.out.println("Enter the number of values");
       int n=sc.nextInt();
       System.out.println("Enter the values");
       for(int i=0;i<n;i++)
       x[i]=sc.nextInt();
       int low,high,mid;
       low=0;
       mid=0;
       high=n-1; 
       while(mid<=high)
       {
           switch(x[mid])
           {
               case 0:
               int temp= x[low];
               x[low]=x[mid];
               x[mid]=temp;
               low++;
               mid++;
               break;
               case 1:
               mid++;
               break;
               case 2:
               temp= x[mid];
               x[mid]=x[high];
               x[high]=temp;
               high--;
               break;
           }
       }
       for(int i=0;i<n;i++)
       {System.out.print(x[i]);}
      }
  }


       