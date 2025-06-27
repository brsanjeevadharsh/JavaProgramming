/******************************************************************************

Sum and Product of Array

*******************************************************************************/
import java.util.*;
public class SumandProductOfArray
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the n value");
	int n=in.nextInt();
	int arr[][] = new int[n][n]; 
	System.out.println("Enter the array elements: ");
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	    arr[i][j]=in.nextInt();
	}
	}
	System.out.println("Entered Matrix: ");
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	System.out.print(" "+arr[i][j]);
	}
	System.out.println();
	}
	int sum=0;
	int product=1;
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        sum+=arr[i][j];
	        product*=arr[i][j];
	    }
	}
	System.out.println("Sum of elements in the array: "+sum);
	System.out.println("Product of elements in the array: "+product);
	}
}
