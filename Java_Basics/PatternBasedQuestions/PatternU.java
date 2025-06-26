/******************************************************************************

* *
* *
* *
* *
***

*******************************************************************************/
public class PatternU
{
	public static void main(String[] args) {
	int row=5;
	int col=3;
	for(int i=0;i<row;i++)
	{
	    for(int j=0;j<col;j++)
	    {
	        if(j==col-1 || i==row-1||j==0)
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
