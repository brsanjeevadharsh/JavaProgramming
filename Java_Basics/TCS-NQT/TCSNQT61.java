/*Q1. Take a single line text message from the user. Separate the vowels from the text. Find the
repeating occurrences of vowels from the text message. Display count of which vowel has
repeated how many times. Display a new Text message by removing the vowel characters as output.
Display the output in the exact format shown below in example, after displaying count of
characters on next lines display the new text message on next line. “Hll wlcm” is the new text message
if a text message entered by a user does not contain any vowels then display 0 as output
text message entered by a user contains any numeric value then display 0 as output.

If User enters a blank or empty text message, display “INVALID INPUT” as output. Message
“INVALID INPUT” is case sensitive. Display it in the exact format given.
Example1:
Input:
Hello welcome
Output
a:0
e:3
i:0
o:2
u:0
Hll wlcm
Example2:
Input:
Hll wlcm
Output:
0
*/

import java.io.*;
import java.util.*;
class TCSNQT61
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String word=in.nextLine();
        while(true)
        {
            int a=0,e=0,ifs=0,o=0,u=0;
            if(word.trim().isEmpty())
            {
                System.out.println("INVALID INPUT");
                break;
            }
            else
            {
                for(int i=0;i<word.length();i++)
                {
                    char result = word.charAt(i);
                    switch(result)
                    {
                        case 'a','A'-> 
                        {
                        a++;
                        }
                        case 'e','E'-> 
                        {
                        e++;
                        }
                        case 'i','I'-> 
                        {
                        ifs++;
                        }
                        case 'o','O'-> 
                        {
                        o++;
                        }
                        case 'U','u'-> 
                        {
                        u++;
                        }
                        // default:
                        // {
                        //   a+=0; 
                        // }
                        
                    }
                }
                    System.out.println("a: "+a);
                    System.out.println("e: "+e);
                    System.out.println("ifs: "+ifs);
                    System.out.println("o: "+o);
                    System.out.println("u: "+u);
                    break;
                    // System.out.println("b: "+b);
                    // System.out.println("c: "+c);
            }
            
        }
    }
}