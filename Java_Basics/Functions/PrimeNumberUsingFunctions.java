//Prime number using recursion Function
import java.io.*;
import java.util.*;
class PrimeNumberUsingFunctions
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(recursion(n))
        {
            System.out.println("Prime Number");
        }
        else 
        {
            System.out.println("Not the prime number");
        }
    }
    public static boolean recursion(int n)
    {
        int count=0;
       for(int i=1;i<=n;i++)
       {
           if(n%i==0)
           {
            count++;   
           }
       }
       if(count==2)
       {
           return true;
       }
       else
       {
           return false;
       }
        
    }
}
