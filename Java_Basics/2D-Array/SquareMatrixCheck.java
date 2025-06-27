/******************************************************************************

    To check given matrix square matrix or not

*******************************************************************************/
import java.util.*;
public class SquareMatrixCheck
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int n1=in.nextInt();
	System.out.println("Enter the no of columns");
	int n2=in.nextInt();
	int arr[][] = new int[n1][n2]; 
	System.out.println("Enter the array elements: ");
	for(int i=0;i<n1;i++)
	{
	    for(int j=0;j<n2;j++)
	    {
	    arr[i][j]=in.nextInt();
	}
	}
	int i=0,j=0;
	System.out.println("Entered Matrix: ");
	for(i=0;i<n1;i++)
	{
	for(j=0;j<n2;j++)
	{
	System.out.print(" "+arr[i][j]);
	}
	System.out.println();
	}
	System.out.println("No of Rows: "+i);
	System.out.println("No of Columns: "+j);	
	 if(i==j)
	 {
	     System.out.println("Given Matrix is Square matrix");
	 }
	 else
	 {
	     System.out.println("Given matrix is not a square matrix");
	 }
	    
	}
}
