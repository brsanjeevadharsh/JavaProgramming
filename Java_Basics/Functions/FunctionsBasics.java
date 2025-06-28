//Functions in Java

import java.io.*;
import java.util.*;
public class FunctionsBasics
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1=in.nextInt();
		num2=in.nextInt();
		addition(num1,num2); //With parameter and without return type
		System.out.println("Subtraction: "+subtraction(num1,num2)); //With Parameter and with return type
	    multiplication(); //Without parameter and without return type
		System.out.println("Division: "+division());//Without parameter and with return type
	}
	public static void addition(int num1,int num2) //With argument and without return type
	{
		int add=num1+num2;
		System.out.println("Addition: "+add);
	}
	public static int subtraction(int num1,int num2) //With argument and with return type
	{
		int sub=num1-num2;
		return sub;
	}
	public static void multiplication() //Without argument and without return type
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter two numbers: ");
	    int n1=in.nextInt();
	    int n2=in.nextInt();
	    System.out.println("Multiplication: "+(n1*n2));
	}
	public static int division() //Without argument and with return type
	{
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter two numbers greater than zero: ");
	    int n1=in.nextInt();
	    int n2=in.nextInt();
		int div=n1/n2;
		return div;
	}
}