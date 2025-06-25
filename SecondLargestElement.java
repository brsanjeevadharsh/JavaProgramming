import java.io.*;
import java.util.*;
class SecondLargestElement
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
        for(int i=0;i<n;i++)
        {
        if(arr[i]>largest)
        {
            largest = arr[i];
        }
        }
        int slargest=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>slargest && arr[i]!=largest)
            {
                slargest=arr[i];
            }
        }
        System.out.println("Second largest element is "+slargest);
    }
}