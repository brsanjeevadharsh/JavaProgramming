import java.io.*;
import java.util.*;
class DaysOfWeek
{
	public static void main(String args[])
	{
		int dayno;
		Scanner in = new Scanner(System.in);
		System.out.println("1-Monday");
		System.out.println("2-Tuesday");
		System.out.println("3-Wednesday");
		System.out.println("4-Thursday");
		System.out.println("5-Friday");
		System.out.println("6-Saturday");
		System.out.println("7-Sunday");
		System.out.println("Enter the corresponding number for the Day given above");
		dayno=in.nextInt();
		switch(dayno)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weeddays");
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
	}
}