/*Indian Premier League IPL Cricket Matches are organized for a few Days. The problem is to
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



package Assignment_3;
import java.util.ArrayList;
import java.util.Scanner;
public class IPL {

	public void timeTable(ArrayList<String> teams) {
		ArrayList<String> output = new ArrayList<String>();
		int count = 0;
		for(int i = 0; i<teams.size(); i++) {
			for(int j = i+1; j<teams.size(); j++) {
				output.add(teams.get(i)+"-VS-"+teams.get(j));
				count+=1;
			}
		}
		System.out.println("TOTAL MATCHES: "+count);
		for(int i = 0; i<output.size(); i++) {
			System.out.println(output.get(i));
		}
	}
	
	public static void main(String[] args) {
		IPL test_1 = new IPL();
		Scanner input = new Scanner(System.in);
		ArrayList<String> team = new ArrayList<String>();
		String s = new String();
		while((s=input.nextLine()) != null){
			if(team.size() == 12 || s.length()== 0) {
				break;
			}
			team.add(s);
			
		}
		if(team.size() > 2 && team.size()<=12) {
			System.out.println("Q");
			test_1.timeTable(team);
		}
		input.close();
	}

}
