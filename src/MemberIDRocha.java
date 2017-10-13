import java.util.Scanner;

public class MemberIDRocha {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Initialize ID to an empty string
		String ID = "";
		
		// Print out a message and read the first entry
		System.out.print("Please enter an ID 14 characters long: ");
		ID = in.nextLine();
		
		// Verify if the entry was 14 characters long.
		// If not, it will keep asking until the user enter a 14 characters long string
		while (ID.length() != 14) {
			System.out.print("Didn't I say 14 characters long? Please enter an ID 14 characters long: ");
			ID = in.nextLine();
		}
	
		// I wasn't sure if we needed to keep the original entry as lower case 
		// but I converted it all into Upper Case and assigned it back into the ID variable
		ID = ID.toUpperCase();
		
		// For code readability, I have broken down the output into multiple lines using "System.out.print" and not "println" 
		
		// Get the first character at index 0 and substring from 1 to 3 index (4 is not included) plus blank space
		System.out.print(ID.charAt(0) + "-" + ID.substring(1, 4) + " ");
		// Get substring from 4 to 7 index plus blank space
		System.out.print(ID.substring(4, 8) + " ");
		// Get substring from 8 to 9 index plus substring from 10 to 12 plus blank space
		System.out.print(ID.substring(8, 10) + "-" + ID.substring(10, 13) + " ");
		// Get last character using "length - 1" and surround it by parenthesis
		System.out.print("(" + ID.charAt(ID.length() - 1) + ")");
		
		// Closed the Scanner
		in.close();
	}

}
