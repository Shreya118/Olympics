//Author : Shreya Pagui
//Program : Olympic Management System
//main class

package olympic;

import java.util.Scanner;
import java.util.*;

public class OlympicManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		int choice;
		
		do {
			System.out.println("Olympic Management System");
			System.out.println("1. Player form");
			System.out.println("2. Game Description");
			System.out.println("3. Exit");
			
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1 :
				Player.displayDetails(scanner);
				break;
				
			case 2:
				Game.displayDetails(scanner);
				break;
				
			case 3:
				System.out.println("Exiting....");
				break;
				
			default :
				System.out.println("Invalid choice. Please enter a valid number");
			}
		}  while (choice != 3) ;
		scanner.close();
		

	}

}
