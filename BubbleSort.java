import java.io.*;
import java.util.*;
class BubbleSort
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
    BubbleSort(n,arr);
     for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
    }
    public static void BubbleSort(int n,int arr[])
    {
      for(int i=n-1;i>=0;i--)
      {
          int diddigit=0;
          for(int j=0;j<n-1;j++)
          {
              if(arr[j]>arr[j+1])
              {
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                  diddigit=1;
              }
          }
              if(diddigit==0)
              break;
      }
    //  for(int i=0;i<n;i++)
    // {
    //   System.out.print(arr[i]);
    // } 
      
    }
}





