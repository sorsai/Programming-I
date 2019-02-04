import java.util.Scanner;
import org.omg.Messaging.SyncScopeHelper;

public class Project {
	public static void menu() {
		System.out.println("[1] Seat plan");
		System.out.println("[2] Buy a ticket");
		System.out.println("[3] Pay now");
		System.out.println("[4] Concert Information ");	
	}
	public static void main(String[] args) {
		System.out.println("******* Welcome to Stamford Concert *******");
		System.out.println("*******************************************");
	// type user's name
		Scanner name = new Scanner(System.in);
		System.out.print("What is your name? ");	
		String Name = name.nextLine();
	// loop of asking user's purpose
		int num = 0;
		 while (num <= 100){
		System.out.println("hello, " + Name + ". How can I help you?");
		menu();
	//input user's number
		Scanner number = new Scanner(System.in);
		System.out.print(" Press 1, 2, 3, 4, or -1 to exit: ");
		int inputNum = number.nextInt();
			if (inputNum == -1) {
			   System.out.println("Thank you!! Hope to see you soon.");
			break;
			}
	// preserve prank input number from users
		if (inputNum == 0 || inputNum < -1 || inputNum > 4){
			System.out.println("Please press 1, 2, 3, 4 or -1 to exit only");
		}
	// display seat plan
		if (inputNum == 1) {
			for (int s = 1; s <=20 ; s++) {
				if (s == 5 || s == 10 || s == 15){
					System.out.print("[" + s + "]  " + "\n");
				}else 
				System.out.print("[" + s + "] ");
			} 
			System.out.print("\n");
		}	
	// buying tickets
		if (inputNum == 2 ) {
		 System.out.println("****** BUY ******");
		 Scanner seat = new Scanner(System.in);
		 System.out.print("Enter seat number: ");
		 int seatNum = seat.nextInt(); 
		 	if (seatNum > 20 || seatNum < 1){
				System.out.println("Sorry the entered seat number is not valid");
			} else {
				System.out.println("Thank you for booking the concert");
				System.out.println("Seat  #" + seatNum + " is booked.");
				}
			}
		// calculate the prices for users
//		if (inputNum == 3) {
//			System.out.println();
//		}
		//Concert Information
		if ( inputNum == 4) {
			System.out.println("**********************************************");
			System.out.println("Stamford Concert is organized by STIU All Star");
			System.out.println("  The booking system is created by Punyanuch  ");
			System.out.println("**********************************************");
			}
		 }
	}
}

