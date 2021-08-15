/*  Display sequence of Fibonacci series until the number given by user and count total even
numbers and odd numbers in that series except zero.
Fibonacci series should start with 1.
Total count of even numbers should be displayed in the first row and odd numbers should be
displayed in the next row.
Number given by user for Fibonacci series should be greater than 5 and less than or equal to 20
otherwise display &quot;INVALID INPUT&quot;.
If the number given by the user is space, character or empty display “INVALID OUTPUT”.
The text message displayed should be in exact format as it is case sensitive. The text message
displayed should be in exact format as it is case sensitive.
In below example 2 is for count of even numbers that is (2,8) and 5 is count of odd numbers
that is (1, 1, 3, 5, 13)
Example:
Input:
7
Output:
1 1 2 3 5 8 13
2
5*/

package Assignment_3;
import java.util.Scanner;
public class FibonnaciSeries {

	public void fibo(int count) {
		if(count == 0) {
		}else if(count==1) {
			System.out.println("1");
		}else if(count == 2) {
			System.out.print("1 1");
		}else {
		int f0=1, f1=1, evenCount=0, oddCount=2;
		System.out.print(f0+" "+f1+" ");
		for(int i = 2; i<count; i++) {
			int f2 = f0+f1;
			if(f2%2 == 0) {
				evenCount +=1;
			}else {
				oddCount +=1;
			}
			System.out.print(f2 + " ");
			f0 = f1;
			f1 = f2;
		}
		System.out.println("\n"+evenCount+"\n"+oddCount);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonnaciSeries test_1 = new FibonnaciSeries();
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		test_1.fibo(count);
		input.close();
	}

}
