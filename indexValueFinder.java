package String;

import java.util.Scanner;

public class indexValueFinder{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		System.out.println("Enter the index");
		int index = scan.nextInt();
		
		if(index>=0 && index<=str.length()) {
		char y = str.charAt(index);
		
		System.out.println(y);
		}
		
		
	}
}