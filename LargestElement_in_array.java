import java.io.*;
import java.util.*;
class LargestElement_in_array
{
    public static void main(String args[])
    {
        int n,total=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=in.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int largest=arr[0];
        for(int i=0;i<n-1;i++)
        {
           if(arr[i]>arr[i+1])
           {
               largest=arr[i];
           }
           else
           {
               largest=arr[i+1];
           }
        }
        System.out.println("Largest Element:"+largest);
    }
}