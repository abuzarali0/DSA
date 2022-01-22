import java.util.*;
import java.lang.*;
class minjump {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a[]= new int[20];
    System.out.println("Enter the number of values");
    int n=sc.nextInt();
    System.out.println("Enter the values");
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int jump=0;
    int steps=0;
    int max=0;
    for(int i=0;i<n;i++)
    {
        max=Math.max(max, a[i]+i);
        if(i==steps)
        {
            steps=max;
            jump++;
        }
    }
    if(steps>=n-1)
    {
        System.out.println("Minimum numbers of steps are "+jump);
    }
    else
    {

    System.out.println("-1");
}
}
}

        
    