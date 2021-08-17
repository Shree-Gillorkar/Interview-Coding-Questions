/* Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for a running test on track for 3 rounds. You need to record their oxygen level after every round.After trainees are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select the one with the highest average oxygen level as the most fit trainee. If more than one trainee attains the same highest average level,they all need to be selected. Display the most fit trainee(or trainers) and the highest average oxygen level.
Note:
1. The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
2.If the calculated maximum average oxygen value of the trainees is below 70 then declare the
trainees as unfit with meaningful message as “All trainees are unfit”
3.Average oxygen values should be rounded
Example 1:
INPUT Values
95
92
95
92
90
92
90
92
90

OUTPUT Values
Trainee Number: 1
Trainee Number :3
Note: Input should be 9 integer values representing oxygen levels entered in order as
Round 1:
Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Round 2:
Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Round 3:
Oxygen value of trainee 1
Oxygen value of trainee 2
Oxygen value of trainee 3
Oxygen must be in given format as in above example.For any wrong input final output should
display “INVALID INPUT”
*/

package Assignment_3;

import java.util.Scanner;

public class MPSCSelection {

	public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int[][] oxy = new int[3][3];
         for(int i =0; i<3; i++) {
        	 for(int j = 0; j<3; j++) {
        		 oxy[i][j] = input.nextInt();
        		 if(oxy[i][j]<1 || oxy[i][j]>100) {
        			 oxy[i][j]=0;
        		 }
        	 }
         }
         
         int[] avg = new int[3];
         
         for(int i =0; i<3; i++) {
        	 for(int j = 0; j<3; j++) {
        		 avg[i] = avg[i] + oxy[j][i];
        	 }
        	 avg[i] = avg[i]/3;
         }
         
         int max = avg[0];
         
         for(int i = 1; i<3; i++) {
        	 if(avg[i]>max) {
        		 max = avg[i];
        	 }
         }
         
         for(int i = 0; i<3; i++) {
        	
        		 System.out.println(avg[i]);
        	 }
         
         if(max>70) {
            for(int i = 0; i<3; i++) {
        	 if(avg[i]==max) {
        		 System.out.println("Trainee Number : "+(i+1));
        	 }
            }
         }else{
        	 System.out.println("“All trainees are unfit");
         }
         input.close();
	}

}
