/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class PatternA
{
	public static void main(String[] args) {
	int row=5;
	int col=3;
	for(int i=0;i<row;i++)
	{
	    for(int j=0;j<col;j++)
	    {
	        if(i==0 || j==0 || i==row/2 || j==(col-1))
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
