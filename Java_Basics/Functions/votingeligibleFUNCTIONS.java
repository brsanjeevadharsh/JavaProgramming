//Voting eligible
import java.io.*;
import java.util.*;
public class votingeligibleFUNCTIONS
{
    public static void main(String args[])
    {
    if(votingeligible())
    {
        System.out.println("Eligible to vote");
    }
    else
    {
        System.out.println("Not eligible to vote");
    }
    }
static boolean votingeligible()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the age: ");
    int age=in.nextInt();
    if(age>=18)
    {
        return true;
    }
    else
    {
        return false;
    }
}
}
