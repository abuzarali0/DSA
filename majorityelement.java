import java.util.*;

public class majorityelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        List<Integer> result = new ArrayList<Integer>();

        int major1=Integer.MAX_VALUE;
        int major2=Integer.MAX_VALUE;
        int firstcount=0;
        int secondcount=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]==major1)
            {
                firstcount++;
            }
            else if(x[i]==major2)
            {
                secondcount++;
            }
           
            else if(firstcount==0)
            {
                major1=x[i];
                firstcount=1;
            }
            else if(secondcount==0)
            {
                major2=x[i];
                secondcount=1;
            }
            else
            {
                firstcount--;
                secondcount--;
            }
            
        }
        firstcount=0;
        secondcount=0;
        for(int i=0;i<n;i++)
        {
            if(x[i]==major1)
            {
                firstcount++;
            }
            if(x[i]==major2)
            {
                secondcount++;
            }
        }
        if(firstcount>(n/3))
        {
            result.add(major1);
        }
        if(secondcount>(n/3))
        {
            result.add(major2);
        }
        for(int i = 0; i < result.size(); i++) {   
            System.out.println (result.get(i));
        }  
    }
}

        