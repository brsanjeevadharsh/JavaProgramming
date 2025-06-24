import java.io.*;
import java.util.*;
class SelectionSort
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n= in.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array:");
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
     SelectionSort(arr,n);
       for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
  }
  public static void SelectionSort(int arr[],int n)
  {
    int temp;
    for(int i=0;i<n-1;i++)
    {
      int mini=i;
      for(int j=i+1;j<n;j++)
      {
        if(arr[mini]>arr[j])
        {
            mini=j;
      }
    }
    temp=arr[mini];
    arr[mini]=arr[i];
    arr[i]=temp;
    }
  }
}


