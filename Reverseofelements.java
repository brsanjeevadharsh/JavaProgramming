import java.io.*;
import java.util.*;
class Reverseofelements
{
    public static void main(String args[])
    {
        int n,total=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=in.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[] = new int[n];
         int arr1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           arr1[i]=arr[n-i-1];
        }
       for(int i=0;i<n;i++)
       {
           System.out.println(arr1[i]);
       }
    }
}