/******************************************************************************

*****
   * 
  *  
 *   
*****

*******************************************************************************/
public class PatternZ
{
	public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++)
	{
	    for(int j=0;j<n;j++)
	    {
	        if(i==n-1||i==0||i+j==n-1)
	        {
	            System.out.print("*");
	        }
	        else
	        {
	            System.out.print(" ");
	        }
	    }
	    System.out.println();
	}
	}
}
