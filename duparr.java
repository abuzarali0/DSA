import java.util.*;
import java.lang.*;
class duparr {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int nums[]= new int[20];
    System.out.println("Enter the number of values");
    int n=sc.nextInt();
    System.out.println("Enter the values");
    for(int i=0;i<n;i++)
    nums[i]=sc.nextInt();
    int slow= nums[0];
    int fast= nums[0];
    do{
        slow=nums[slow];
        fast=nums[nums[fast]];
    }
    while(slow!=fast);
    fast=nums[0];
    while(slow!=fast)
    {
        slow=nums[slow];
        fast=nums[fast];
    }
    System.out.println("Duplicate Value is "+ slow);
}
}

