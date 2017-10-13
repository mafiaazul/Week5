<<<<<<< HEAD
<<<<<<< HEAD

public class MadLibsRocha {

=======
=======
>>>>>>> 4a2a0c5241a8000c36cb38a8bd471054178c9499
import java.util.Scanner;

public class MadLibsRocha {

	public static void main(String[] args) {

		String name = "";
		String object1 = "";
		String object2 = "";
		String object3 = "";
		String verb = "";
		String adjective = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		name = in.nextLine();
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		
		System.out.print("Enter an object: ");
		object1 = in.nextLine();
		object1 = object1.toLowerCase();
		
		System.out.print("Enter an object: ");
		object2 = in.nextLine();
		object2 = object2.toLowerCase();
		
		System.out.print("Enter an object: ");
		object3 = in.nextLine();
		object3 = object3.toLowerCase();
		
		System.out.print("Enter a past tense verb: ");
		verb = in.nextLine();
		verb = verb.toLowerCase();
		
		System.out.print("Enter an adjective: ");
		adjective = in.nextLine();
		adjective = adjective.toLowerCase();
		
		System.out.println("---------------------------------");
		System.out.println(name + " had a little " + object1);
		System.out.println("Its " + object2 + " was " + adjective + " as snow");
		System.out.println("And everywhere that " + name + " " + verb);
		System.out.println("The " + object3 + " was sure to go.");
		
		in.close();
	}

<<<<<<< HEAD
>>>>>>> 4a2a0c5241a8000c36cb38a8bd471054178c9499
=======
>>>>>>> 4a2a0c5241a8000c36cb38a8bd471054178c9499
}
