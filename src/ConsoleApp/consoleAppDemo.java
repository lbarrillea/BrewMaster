package ConsoleApp;
/**
 * @author Louis
 */
import java.util.Scanner;

public class consoleAppDemo {
	
	static void response () {
		System.out.println("not yet Implimented");
		return;
	}
	
	static void error () {
		System.out.println("Please Enter Valid Option");
		return;
	}
	
	static void endprogram() {
		System.out.println("CLosing Application...");
	}
	
	public static void main(String[] args) {
		
		String input;
		int choice = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Brewmaster");
		System.out.println("Press enter to continue");
		
		input = scan.nextLine();
		
		System.out.println("Press 1 for open Tavern Owners Menu");
		System.out.println("Press 2 for view Inventory");
		System.out.println("Press 3 for Admin Menu");
		System.out.println("press 4 to Close Application");
		System.out.println("");
		System.out.println("ENTER your option -> :");

		while (choice !=4) {
			
			choice = scan.nextInt();
			
			switch (choice) {
				case 1:
					response();
					System.out.println("");
					System.out.println("Press 1 for open Tavern Owners Menu");
					System.out.println("Press 2 for view Inventory");
					System.out.println("Press 3 for Admin Menu");
					System.out.println("press 4 to Close Application");
					System.out.println("");
					System.out.println("ENTER your option -> :");
					break;
				case 2:
					response();
					System.out.println("");
					System.out.println("Press 1 for open Tavern Owners Menu");
					System.out.println("Press 2 for view Inventory");
					System.out.println("Press 3 for Admin Menu");
					System.out.println("press 4 to Close Application");
					System.out.println("");
					System.out.println("ENTER your option -> :");
					break;
				case 3:
					response();
					System.out.println("");
					System.out.println("Press 1 for open Tavern Owners Menu");
					System.out.println("Press 2 for view Inventory");
					System.out.println("Press 3 for Admin Menu");
					System.out.println("press 4 to Close Application");
					System.out.println("");
					System.out.println("ENTER your option -> :");
					break;
				default: 
					if(choice !=4) {
						error();
						System.out.println("");
						System.out.println("Press 1 for open Tavern Owners Menu");
						System.out.println("Press 2 for view Inventory");
						System.out.println("Press 3 for Admin Menu");
						System.out.println("press 4 to Close Application");
						System.out.println("");
						System.out.println("ENTER your option -> :");
					}

					break;
			}
		}
		endprogram();
	}
}
	

