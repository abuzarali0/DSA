
import java.util.*;
class kthmaxmin
{
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int x[]= new int[20];
         System.out.println("Enter the number of values");
         int n=sc.nextInt();
         System.out.println("Enter the values");
         for(int i=0;i<n;i++)
         x[i]=sc.nextInt();
         System.out.println("Enter the kth max element to be found");
         int k= sc.nextInt();
         PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i=0;i<n;i++)   
        {
        	pq.add(x[i]);
        	if(pq.size()>k)
        		pq.poll();
        		
        }
         System.out.println(pq.peek());
        
         }
}
    