package String;

import java.util.Scanner;

public class swapTwoNumbers{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st digit: ");
		int x = scan.nextInt();
		System.out.println("Enter the 2nd digit: ");
		int y = scan.nextInt();
		int z = x;
		x = y;
		y = z;
		System.out.println("The swapped numbers are: " + x +y);
		
		
		
		
	}
	
}
