import java.io.*;
import java.util.*;
class OddandEvenElements
{
    public static void main(String args[])
    {
        int n,total=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=in.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[] = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=in.nextInt();
        // }
        int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("no of odd elements: "+odd);
        System.out.println("no of even elements: "+even);
        
    }
}