package ConsoleApp;
/**
 * @author Louis
 */
import java.util.Scanner;

public class consoleAppDemo {
	
	static int console[] = {1, 2, 3,};
	int menuoptions; 
	static int menuinput;

	public static void main(String[] args) {
		
	int console[] = {1, 2, 3,};
		
		Scanner in = new Scanner(System.in);
		System.out.println("Brewmaster");
		System.out.println("Press enter to continue");
		
			in.nextLine();
		System.out.println("Press (1) for open Tavern Owners Menu");
		System.out.println("Press (2) for view Inventory");
		System.out.println("Press (3) for Admin Menu");
		System.out.println("press (4) to Close Application");
		System.out.println("  ");
		System.out.println("ENTER YOUR OPTION    :");
	{
	
try	{	
	while (menuinput==0)
	{
		String input = in.nextLine();
		int parsedInput = Integer.parseInt(input);
		int indexOfNumber = -1;
		
		for (int console1=0; console1<1; console1++) {
			if( parsedInput == console[console1] && parsedInput != 0)
			{
				indexOfNumber = console1;
			}
			if(indexOfNumber != 1)
			{
				menuinput = parsedInput;
				console[console1] =0;

			}
			
		
			System.out.println("Not Yet Implimented");
			
			
		}
	}
}catch(NumberFormatException e) {
			System.out.println("Please Enter Valid Option");
			System.out.println(e);
		}finally {
			if(menuinput==4) {
			System.out.println("CLosing Application...");
		}
	}
	}
}
}
	


/*		while (Console==0)
			{				
			String input = in.nextLine();
			int parsedInput = Integer.parseInt(input);
			int indexOfNumber = -1;
	
			for(int index=0; index<5; index++)
			{
				if (parsedInput==menuinput[index]) {
				indexOfNumber=index;
				}
			}
		if (indexOfNumber != -1)
		{
			Console = parsedInput;
			System.out.println("not implimented yet");
		}else 
			{
				System.out.println("PLease Input a Valid Option");
			}
	}
	}
	}
*/



