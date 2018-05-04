import java.util.Scanner;
/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_ShapeChooser {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
				System.out.print("What shape would you like drawn? ");
				String choice = console.nextLine();
				if (choice.startsWith("tri")) {
					drawTri();
				} else if (choice.startsWith("box")) {
					drawBox();
				} else {
					System.out.print("Error: Can not draw a " + choice + "shape.");
				}

	}
	
	private static void drawBox() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <=9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void drawTri() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");
			}
			
			for( int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
