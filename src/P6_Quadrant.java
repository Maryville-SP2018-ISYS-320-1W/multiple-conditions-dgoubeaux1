import java.util.Scanner;
/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P6_Quadrant {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		 System.out.print("What is x?");
		 int x = console.nextInt();
		 System.out.print("What is y?");
		 int y = console.nextInt();
		
		 quadrant(x,y);
	}              

		public static void quadrant(double x, double y) {
		    if(x > 0 && y > 0)
		        System.out.println("Quadrant 1");

		    if(x < 0 && y > 0)
		    	System.out.println("Quadrant 2");

		    if(x < 0 && y < 0)
		    	System.out.println("Quadrant 3");

		    if(x > 0 && y < 0)
		    	System.out.println("Quadrant 4");

		    
		
	}

	}
