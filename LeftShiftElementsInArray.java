/******************************************************************************

7.Write a C program to shift all elements of a 1D array one position to the left.
Example:
Input: int[] arr = {1, 2, 3, 4, 5};
Output: Shifted Array = {2, 3, 4, 5, 1}


*******************************************************************************/
import java.util.*;
public class LeftShiftElementsInArray
{
	public static void main(String[] args) {
		int arr[]={1,2,3,5,6};
		int n=arr.length;
		int temp=arr[0];
		for(int i=0;i<n-1;i++)
		{
		    arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		System.out.println(Arrays.toString(arr));
		
	}
}
