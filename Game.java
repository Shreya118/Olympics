package olympic;

import java.util.Scanner;

public class Game extends Olympic {
	String g_name;
	String description;
	int game_id;
	String date;
	String location;
	
	public static void displayDetails(Scanner scanner) {
		int gchoice;
		
		do {
			System.out.println("Games");
			System.out.println("1. Game Name");
			System.out.println("2. Game id");
			System.out.println("3. Game Description");
			System.out.println("4. Location");
			System.out.println("5. Date");
			System.out.println("6. Back to main menu");
			
			System.out.println("Enter your choice: ");
			gchoice = scanner.nextInt();
			
			switch (gchoice) {
			case 1 :
				System.out.println("\nRunning\n Hockey\n Relay\n Javelin Throw\n");
				break;
				
			case 2:
				System.out.println("\nRunning=01\n Hockey=02\n Relay=03\n Javelin Throw=04\n");
				break;
				
			case 3:
				System.out.println("\nRunning : player have to run 2km within minimun amount of time\n Hockey : 2 teams will compete with each other\n Relay : $ players have to run and win \n Javelin Throw : Throwing javelin for maximum length\n");
				break;
				
			case 4:
				System.out.println("\nRunning : outdoor stadium 1\n Hockey : outdoor stadium 2\n Relay : outdoor stadium 3\n Javelin Throw : outdoor stadium 4\n");
				break;
			
			case 5:
				System.out.println("\nRunning : 01/01/25\n Hockey : 03/01/25\n Relay : 03/01/25\n Javelin Throw : 03/01/25\n");
				break;
				
			case 6:
				System.out.println("Back to main menu....\n");
				break;
				
			default :
				System.out.println("Invalid choice. Please enter a valid number");
			}
		}  while (gchoice != 6) ;
		
	}

}
