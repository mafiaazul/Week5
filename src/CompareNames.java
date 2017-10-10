import java.util.Scanner;

public class CompareNames {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter 1st name: ");
		String firstName = in.nextLine();
		
		System.out.print("Please enter 2nd name: ");
		String secondName = in.nextLine();
		
		if (firstName.equalsIgnoreCase(secondName))
			System.out.print("Both names are equal");
		else 
			System.out.print("Names are different!");
		
		in.close();
	}

}
