import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P4_ColorNamer {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
				System.out.print("What color do you want? ");
				String choice = console.nextLine();
				
				if (choice.equalsIgnoreCase("r")) {
				    System.out.println("You have chosen Red.");
				} else if (choice.equalsIgnoreCase("g")) {
				    System.out.println("You have chosen Green.");
				} else if (choice.equalsIgnoreCase("b")) {
				    System.out.println("You have chosen Blue.");
				} else {
				    System.out.println("Error: I don't know what a " + choice + " is.");
				}
		 	}
	}


