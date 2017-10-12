import java.util.Scanner;

/*
 * Write a program that reads a number between 1,000 and 999,999 from the user
 * and prints it with a comma separating the thousands.
 * Here is a sample dialog; the user input is in color:
 * Please enter an integer between 1000 and 999999: 23456
 * 23,456
 */

public class R2_14 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer between 1000 and 999999: ");
		String number = in.next();
		System.out.println(number.substring(0, number.length() - 3) + "," +
						   number.substring(number.length() - 3));

		in.close();

	}

}
