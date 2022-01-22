import java.util.*;
class unionintersection {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int x[]= new int[20];
       int a[]= new int[20];
       System.out.println("Enter the number of values of both arrays");
       int n=sc.nextInt();
       int m=sc.nextInt();
       System.out.println("Enter the values of both");
       for(int i=0;i<n;i++)
       x[i]=sc.nextInt();
       for(int i=0;i<m;i++)
       a[i]=sc.nextInt();
       Set <Integer> st= new HashSet<>();
       for(int i=0;i<n;i++)
       {
           st.add(x[i]);
       }
       int h=st.size();
       for(int i=0;i<m;i++)
       {
           st.add(a[i]);
       }
       int b=st.size();
       System.out.println("Union count is " +b);
       int count=0;
       Set <Integer> str= new HashSet<>();
       for(int i=0;i<n;i++)
       {
           str.add(x[i]);
       }
       for(int i=0;i<m;i++)
       {
           if (str.contains(a[i]))
           count++;
       }
       System.out.println("Intersection count is " +count);


       
}
}
