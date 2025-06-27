/******************************************************************************

Sum and Product of Array

*******************************************************************************/
import java.util.*;
public class MatrixMultiplication
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Enter the n value for Matrix 1");
	int n1=in.nextInt();
	int arr1[][] = new int[n1][n1]; 
	System.out.println("Enter the array elements of Matrix 1: ");
	for(int i=0;i<n1;i++)
	{
	    for(int j=0;j<n1;j++)
	    {
	    arr1[i][j]=in.nextInt();
	}
	}
	
	System.out.println("Enter the n value for Matrix 1");
	int n2=in.nextInt();
	int arr2[][] = new int[n2][n2]; 
	System.out.println("Enter the array elements of Matrix 2: ");
	for(int i=0;i<n2;i++)
	{
	    for(int j=0;j<n2;j++)
	    {
	    arr2[i][j]=in.nextInt();
	}
	}
	
	
	System.out.println("Entered Matrix 1 : ");
	for(int i=0;i<n1;i++)
	{
	for(int j=0;j<n1;j++)
	{
	System.out.print(" "+arr1[i][j]);
	}
	System.out.println();
	}
	
	System.out.println("Entered Matrix 2 : ");
	for(int i=0;i<n2;i++)
	{
	for(int j=0;j<n2;j++)
	{
	System.out.print(" "+arr2[i][j]);
	}
	System.out.println();
	}
	
	
	int sum[][] = new int[n1][n1];
	for(int i=0;i<n2;i++)
	{
	for(int j=0;j<n2;j++)
	{
	  sum[i][j]+=arr1[i][j]+arr2[i][j];
	    
	}
	}
	
	int product[][] = new int[n1][n2];
	for(int i=0;i<n2;i++)
	{
	for(int j=0;j<n2;j++)
	{
	    int temp=0;
	   for(int k=0;k<n1;k++)
	   {
	   temp+=arr1[i][k]*arr2[k][j];
	   System.out.println("temporary value"+temp);
	    }
	     product[i][j]=temp;
	}
	}
	
	for(int i=0;i<n1;i++)
	{
	    for(int j=0;j<n1;j++)
	    {
	        System.out.print("  "+sum[i][j]);
	    }
	    System.out.println();
	}
	
		for(int i=0;i<n1;i++)
	{
	    for(int j=0;j<n1;j++)
	    {
	        System.out.print("  "+product[i][j]);
	    }
	    System.out.println();
	}
	
// 	System.out.println("Product of elements in the array: "+product);
	}
}
