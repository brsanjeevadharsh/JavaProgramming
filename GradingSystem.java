import java.io.*;
import java.util.*;
class GradingSystem
{
	public static void main(String args[])
	{
		int mark1,mark2,mark3,mark4,mark5;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		mark1=in.nextInt();
		mark2=in.nextInt();
		mark3=in.nextInt();
		mark4=in.nextInt();
		mark5=in.nextInt();	
		int total=mark1+mark2+mark3+mark4+mark5;
		float average=total/5;
		if(average>90 && average<=100)
		{
			System.out.println("Distinction");
		}
		else if(average>75 && average <=90)
		{
			System.out.println("First Division");
		}
		else if(average>50 && average <=75)
		{
			System.out.println("Second Division");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}