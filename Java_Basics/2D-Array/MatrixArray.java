/******************************************************************************

Create a 2D Matrix array in java

*******************************************************************************/
import java.util.*;
public class MatrixArray
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
	}
}
