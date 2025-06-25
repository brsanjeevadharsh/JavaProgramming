import java.io.*;
import java.util.*;
class DuplicateElementInTheArray
{
    public static void main(String args[])
    {
        int n,total;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=in.nextInt();
        System.out.println("Enter the elements of array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int result = RemoveDuplicate(arr,n);
        System.out.println(result);
        if(result==0)
        {
        System.out.println("No Duplicates found");
        }
        else
        {
        System.out.println("Duplicates Found");
    }
    }
        public static int RemoveDuplicate(int[] arr,int n)
        {
        Arrays.sort(arr);
            int temp=0;
        for(int i=0;i<n-1;i++)
        {
           if(arr[i]==arr[i+1])
           {
           temp++;
           break;
        }
        }
       return temp;
    }
    }