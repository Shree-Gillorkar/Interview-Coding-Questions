/*We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per
square feet and exterior wall painting cost is Rs.12 per square feet. Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each interior wall in units of square feet
4. Surface Area of each exterior wall in units of square feet
If a user enters zero as the number of walls then skip Surface area values as User may not
want to paint that wall. Calculate and display the total cost of painting the property.
Example 1:
6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost:1847.4 INR
*/

package Assignment_3;

import java.util.Scanner;

public class Painting {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numInterWall = input.nextInt();
		int numExterWall = input.nextInt();
		float interWallSurface = 0;
		float exterWallSurface = 0;
		for(int i =0; i<numInterWall; i++) {
			interWallSurface = interWallSurface + input.nextFloat();
		}
		for(int i =0; i<numExterWall; i++) {
			exterWallSurface = exterWallSurface + input.nextFloat();
		}
		
		System.out.println("Total estimated Cost:"+((18*interWallSurface)+(12*exterWallSurface))+" INR");
		input.close();
	}

}
