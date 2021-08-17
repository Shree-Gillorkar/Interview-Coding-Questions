/* A doctor has a clinic where he serves his patients. The doctor's consultation fees are
different for different groups of patients depending on their age. If the patient's age is below
17. The fee is 200 INR. If the patient's age is between 17 and 40, fees are 400 INR.
If the patient's age is above 40, fees are 300 INR. Write a code to calculate earnings in a day for
which one array/List of values representing age of patients visited on that day is passed as
input.
Note:
● Age should not be zero or less than zero or above 120.
● Doctors consult a maximum of 20 patients a day.
● Enter age value (press ENTER without value to stop):
Example 1:
Input
20
30
40
50
2
3
14
Output
Total income 2000 INR
*/


package Assignment_3;
import java.util.Scanner;
import java.util.ArrayList;
public class DoctorAndPatient {
	
	public void fees(ArrayList<Integer> age) {
		int fee=0;
		for(int i =0; i<age.size(); i++) {
			if(age.get(i)<0 || age.get(i)>120) {
				
			}else if(age.get(i)<17) {
				fee=fee+200;
			}else if(age.get(i)>=17 && age.get(i)<40) {
				fee=fee+400;
			}else {
				fee=fee+300;
			}
		}
		System.out.println("Total Income "+fee+" INR");
	}
	
	

	public static void main(String[] args) {
		DoctorAndPatient test_1 = new DoctorAndPatient();
		Scanner input= new Scanner(System.in);
		ArrayList<Integer> age = new ArrayList<Integer>();
		int x = 0;
		while(true){
			String s = input.nextLine();
			if(s == "") {
				break;
			}
			 x = Integer.parseInt(s);
			age.add(x);
			if(age.size()==20){
				break;
			}
		}
		test_1.fees(age);
		input.close();
	}
}
