import java.io.*;
import java.util.*;
class tax
{
	public static void main(String args[])
	{
		int amount;
		float tax;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=in.nextInt();
		if(amount<10000)
		{
			tax=0;
		}
		else if(amount>=10000 && amount<30000)
		{
			tax=10*(amount/100);
		}
		else if(amount>=30000 && amount <50000)
		{
			tax=20*(amount/100);
		}
		else
		{
			tax=30*(amount/100);
		}
		System.out.println("Tax amount:"+tax);
	}
}