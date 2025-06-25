
// 1.Write a C program to find the sum of all elements in a 1D array.
// Example:
// Input: int[] arr = {1, 2, 3, 4, 5};
// Output: Sum = 15

import java.io.*;
import java.util.*;
class SumOfArray
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
        for(int i=0;i<n;i++)
        {
            total+=arr[i];
        }
        System.out.println("Sum of elements:"+total);
    }
}