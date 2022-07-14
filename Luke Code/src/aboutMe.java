import java.util.Scanner;

public class aboutMe {
	String name;
	String school;
	String hobbies;
	String sports;
	boolean isAwesome;
	double netWorth;
	String userName;
	
	
	
	aboutMe(String theUser){
		userName = theUser;
	}
	
	//Function showing the main menu
		void showMenu() {
			char option = '\0';
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome, " + userName + "!");
			System.out.println();
			System.out.println("What would you like to learn about Luke?");
			System.out.println();
			System.out.println("A. Luke's school");
			System.out.println("B. Luke's hobbies");
			System.out.println("C. Luke's sports");
			System.out.println("D. Is Luke awesome???");
			System.out.println("E. Luke's net worth");
			System.out.println("F. Exit");
			
			do {
				System.out.println();
				System.out.println("Enter an option: ");
				char option1 = scanner.next().charAt(0);
				option = Character.toUpperCase(option1);
				System.out.println();
				
				switch(option) {
				//Case 'A' allows the user to check their account balance
				case 'A':
					System.out.println("====================================");
					System.out.println("Ankeny Centennial High School");
					System.out.println("====================================");
					System.out.println();
					break;
				
				//Case 'B' allows the user to deposit money into their account
				case 'B':
					System.out.println("====================================");
					System.out.println("Fishing, running, biking, working out, and watching the Green Bay Packers");
					System.out.println("====================================");
					System.out.println();
					break;
					
				//Case 'C' allows the user to withdraw money from their account
				case 'C':
					System.out.println("====================================");
					System.out.println("Cross Country and Track");
					System.out.println("====================================");
					System.out.println();
					break;
					
				//Case 'D' allows the user to view their most recent transaction
				case 'D':
					System.out.println("====================================");
					System.out.println("True");
					System.out.println("====================================");
					System.out.println();
					break;
					
				//Case 'E' calculates the accrued interest on the account after a number of years has passed
				case 'E':
					System.out.println("====================================");
					System.out.println("1,000,000,000");
					System.out.println("====================================");
					System.out.println();
					System.out.println("====================================");
					System.out.println("Lol I wish");
					System.out.println("====================================");
					break;
					
				//Case 'F' exits the user from their account
				case 'F':
					System.out.println("====================================");
					break;
					
				//The default case lets the user know that they entered an invalid character
				default: 
					System.out.println("Error: invalid option. Please enter A, B, C, D, or E or access services.");
					break;
				}
			} while(option != 'F');
			System.out.println("Goodbye!");	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
	}

}
