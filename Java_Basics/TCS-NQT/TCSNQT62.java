/* Q2:
Indian Premier League IPL Cricket Matches are organized for a few Days. The problem is to
prepare a timetable from Day 1 to Day n, where n depends on the number of teams
participating. Set A represents the Names of Teams participating. Set A will be input from the
user. Do not show an input user message. Directly accept the team names as string values and
enter q to stop taking inputs.
Write code to display Pairing of Teams and possible number of matches possible excluding Semi
Final and Final.
Note: Minimum 3 Teams are required and maximum limit of Teams is 12.

Example1:
Input Values
CHENNAI
MUMBAI
KOLKATA
PATNA
Q
Output Values
TOTAL MATCHES:6
CHENNAI-VS-MUMBAI
CHENNAI-VS-KOLKATA
CHENNAI-VS-PATNA
MUMBAI-VS-KOLKATA
MUMBAI-VS-PATNA
KOLKATA-VS-PATNA
*/

import java.io.*;
import java.util.*;
class TCSNQT62
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        List<String> teams = new ArrayList <String>();
        while(true)
        {
            String name=in.nextLine();
            if(name.equalsIgnoreCase("q"))
            {
                break;
            }
            teams.add(name);
        }
        int n=teams.size();
        for(int i=0;i<teams.size();i++)
        {
            System.out.println(teams.get(i));
        }
        int noofteams=(n*(n-1)/2);
        System.out.println("No of Teams: "+noofteams);
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.println(teams.get(i)+" VS "+teams.get(j));
            }
        }
    }
}