import javax.swing.JOptionPane;

public class HelloUserRocha {

	public static void main(String[] args) {

		String firstName = JOptionPane.showInputDialog("Enter your first name");
		String age = JOptionPane.showInputDialog("Enter your age");
		
		firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
		
		JOptionPane.showMessageDialog(null, "Your name capitalized is " + firstName);
		
		int newAge = Integer.parseInt(age) + 1;
		
		String finalMessage = "Howdy, " + firstName + "." + " Next year you will be " + newAge + " years old.";
		
		JOptionPane.showMessageDialog(null, finalMessage);
		
		System.exit(0);
	}

}
