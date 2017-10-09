import java.util.Scanner;

/*
 * Write a program that reads a number between 1,000 and 999,999 from the user, 
 * where the user enters a comma in the input. Then print the number without a comma. 
 * Here is a sample dialog; the user input is in color:
 * 
 * Please enter an integer between 1,000 and 999,999: 23,456
 * 23456

 * Hint: Read the input as a string. Measure the length of the string. Suppose it contains n characters. 
 * Then extract substrings consisting of the first n – 4 characters and the last three characters.
 */

public class P2_13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter an integer between 1,000 and 999,999: ");
		
		String number = in.next();
		
		number = number.substring(0, number.length() - 4) + number.substring(number.length() - 3);
		
		System.out.println(number);
		
		in.close();
		
	}

}
