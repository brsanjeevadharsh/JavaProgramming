// Factorial of a number
import java.io.*;
import java.util.*;
class FactorialOfNumber
{
    public static void main(String args[])
    {
        int rec=recursion(5);
        System.out.println(rec);
    }
    public static int recursion(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*recursion(n-1);
    }
}