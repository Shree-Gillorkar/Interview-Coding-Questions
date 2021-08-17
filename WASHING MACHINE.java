/*WASHING MACHINE
A Washing Machine works on the principle of a Fuzzy system, the weight of clothes put inside it
for wash is uncertain. But based on weight measured by sensors, it decides time and water
levels which can be changed by menus given on the machine control area. For low Water level,
time estimate is 25 minutes, where approximate weight is 2000 grams or any non-zero positive
number below that.
For Medium Water level, time estimated is 35minutes, where approximate weight is between
2001 grams and 4000 grams.
For High Water level, time estimated is 45 Minutes, where approximate weight is above 4000
grams.
Assume the Capacity of the Machine is maximum 7000 grams.
Where the approximate weight is zero, the time estimate is 0 minutes. Write a function which
takes numeric weight in the range [0,7000] as input and produces estimated time as output; if
input is more than 7000, then output is: "OVERLOADED!", and for all other inputs, the output
statement is "INVALID INPUT”.
Input should be in the form of integer value -
<Integer>
Output must have the following format -
TimeEstimated: <Integer> Minutes
*/


import java.util.*;
public class Main
{
    public int timeRequired(int weight){
        if(weight<0){
            return -1;
        }
        if(weight == 0){
            return 0;
        }
        else if(weight>0 && weight<=2000){
            return 25;
        }
        else if(weight>2000 && weight<=4000){
            return 35;
        }
        else if(weight>4000 && weight<=7000){
            return 45;
        }
        else{
            return 111;
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    Main test_1 = new Main();
	    int weight = input.nextInt();
	    int time = test_1.timeRequired(weight);
	    if(time == -1){
		System.out.println("INVALID INPUT");
	    }else if(time == 111){
	    System.out.println("OVERLOADED!");  
	    }else{
	        System.out.println(time+" Min");
	    }
	}
}
