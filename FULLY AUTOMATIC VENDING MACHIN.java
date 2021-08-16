/* FULLY AUTOMATIC VENDING MACHINE dispenses your cuppa on just the press of button. A
vending machine can serve range of products as follows:
Coffee
1. Espresso Coffee
2. Cappuccino Coffee
3. Latte Coffee
Tea
1. Plain Tea
2. Assam Tea
3. Ginger Tea
4. Cardamom Tea
5. Masala Tea
6. Lemon Tea
7. Green Tea
8. Organic Darjeeling Tea
Soups
1. Hot and Sour Soup
2. Veg Corn Soup
3. Tomato Soup
4. Spicy Tomato Soup

Beverages
1. Hot Chocolate Drink
2. Badam Drink
3. Badam-Pista Drink
Write a program to take input for main menu & sub menu and display the name of sub menu
selected in following format (enter the first letter to select main menu):
Welcome to CCD
Enjoy your <name of sub menu>
Example 1:
Input
c
1
Output
Welcome to CCD!
Enjoy your Espresso Coffee!
Example 2:
Input
t
9
Output
INVALID OPTION!
*/

package Assignment_3;

import java.util.Scanner;

public class Menu {
	
	public String coffee(int n) {
		if(n == 1)
			return "Espresso Coffee";
		else if(n == 2)
			return "Cappiccino Coffee";
		else if(n == 3)
			return "Latte Coffee";
		else
			return "Invalid Option!";				
	}

	public String tea(int n ) {
		if(n == 1)
			return "Plain Tea";
		else if(n == 2)
			return "Assam Tea";
		else if(n == 3)
			return "Ginger Tea";
		else if(n == 4)
			return "Cardamon Tea";
		else if(n == 5)
			return "Masala Tea";
		else if(n == 6)
			return "Lemon Tea";
		else if(n == 7)
			return "Green Tea";
		else if(n == 8)
			return "Organic Darjeeling Tea";
		else
			return "Invalid Option!";
	}
	
	public String soups(int n) {
		if(n == 1)
			return "Hot and Sour Soup";
		else if(n ==2)
			return "Veg corn Soup";
		else if(n == 3) 
			return "Tomato Soup";
		else if(n == 4)
			return "Spicy Tomato Soup";
		else
			return "Invalid Option!";
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Menu test_1 = new Menu();
		char ch = input.nextLine().charAt(0);
		int n = input.nextInt();
		String output = null;
		switch(ch) {
		case 'c':
			output = test_1.coffee(n);
			break;
		case 't':
			output = test_1.tea(n);
			break;
		case 's':
			output = test_1.soups(n);
			break;
		default:
			output = "Invalid Option!";
			//System.out.println("Invalid Option!");
		}
		
		if(output != "Invalid Option!") {
			System.out.println("Welcome to CCD!");
			System.out.println("Enjoy your "+output+"!");
		}else {
			System.out.println("Invalid Option!");
		}
		
		input.close();
	}

}
