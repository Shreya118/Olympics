package olympic;
import java.util.Scanner;


public class Player extends Olympic {
	int player_id;
	String p_name;
	String nationality;
	
	public static void displayDetails(Scanner scanner) {
		int pchoice;
		
		do {
			System.out.println("Player");
			System.out.println("1. Name");
			System.out.println("2. Id");
			System.out.println("3. Nationality");
			System.out.println("4. Back to main menu");
			
			System.out.println("Enter your choice: ");
			pchoice = scanner.nextInt();
			
			switch (pchoice) {
			case 1 :
				System.out.println("\nEnter your name: \n");
				scanner.next();
				break;
				
			case 2:
				System.out.println("\nEnter your id: \n");
				scanner.next();
				break;
				
			case 3:
				System.out.println("\nEnter your nationality: \n");
				scanner.next();
				break;
				
			case 4:
				System.out.println("\nBack to main menu....\n");
				break;
				
			default :
				System.out.println("Invalid choice. Please enter a valid number");
			}
		}  while (pchoice != 4) ;
		
	}

}
