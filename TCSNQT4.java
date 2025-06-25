/******************************************************************************

Q1. Given a non-negative integer array Arr having size N. Each element of the array will carry a different value.
This means no two elements can have the same values.The candidate has to do this with minimal changes in the
original value of the elements, making every element as least as much value as it originally had.
Find the minimum sum of all elements that can be set the array for:
Example 1:
Input
3 -> Value of N, represents size of Arr
2 -> Value of Arr[0]
2-> Value of Arr[1]
4-> Value of Arr[2]
Output
9
Explanation:
As two elements have the same value, max value for the one of them needs to be incremented to 3.
He can set the array with 2+3+4=9

*******************************************************************************/
import java.util.*;
public class TCSNQT4
{
	public static void main(String[] args) {
		int arr[]={2,2,2};
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
		    for(int j=1;j<n;j++)
		    {
		    if(arr[i]==arr[j])
		    {
		        arr[j]++;
		    }
		}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int num:arr)
		{
		    sum+=num;
		}
		System.out.println("Minimum Path: "+sum);
	}
}
