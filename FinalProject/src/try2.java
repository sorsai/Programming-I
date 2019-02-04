import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class try2 {
	static boolean[] seats = new boolean[20];
	public static void main(String[] args) {
		System.out.println("******* Welcome to Stamford Concert *******");
		System.out.println("*******************************************");
		//User input the menu number
		Scanner console = new Scanner(System.in);
		System.out.print("What's your name? ");
		String userName = console.next();
		
		int menu = 0;
		for (int i = 0; i < seats.length;i++) {
		//	seats[i] = i + 1 + "";
		}
		
		// for keep asking until user type -1
		do {
			System.out.println();
			GregorianCalendar time = new GregorianCalendar();
			int hour = time.get(Calendar.HOUR_OF_DAY); 
			if (hour < 12) {
				   System.out.println("Good Morning! " + userName + ". How can I help you?") ;
				}  else if (hour < 17 && !(hour == 12)){
				   System.out.println("Good Afternoon! " + userName + ". How can I help you?");
				}  else if (hour == 12){
				   System.out.println("Good Noon! " + userName + ". How can I help you?");
				}  else{
				   System.out.println("Good Evening! " + userName + ". How can I help you?");
				}
			System.out.println("[1] Seat Plan");
			System.out.println("[2] Buy a ticket");
			System.out.println("[3] Pay now");
			System.out.println("[4] Concert Information");
			System.out.print("Press 1, 2, 3, 4 or -1 to exit: ");
			menu = console.nextInt();
					if (menu > 4 || menu == 0 || menu < -1 ) {
				System.out.println("Please press 1, 2, 3, 4 or -1 to exit only");
					}else if (menu == 1) {
				seatPlan(menu);
					} else if (menu == 2) {
				buyTicket(); //keep return value into variable and input into seatPlan();
					} else if (menu == 3) {
				payNow();
					} else if (menu == 4){
				concertInfo();
					} 
			}	
		//the program will end when user type -1		
		while (menu != -1); 
						System.out.println("Thank you!! Hope to see you soon");
		}
//	public static void seatPlan(/*add variable here */) {  //Add a few lines which changes the chosen position to x, add input value into function
//		//Add a new loop to check values and if it matches with the bought ticket change the value to x using == or VariableName.equals()
//		for (int i = 0; i < seats.length; i++){
//			if (i == 4 || i == 9 || i == 14) { 
//				System.out.print("[" + seats[i] + "]  " + "\n");
//			}else 
//				System.out.print("[" + seats[i] + "]\t");
//		}	
//		System.out.println();
//		//Return amount of seats that are replaced with X
//	}
	public static void seatPlan(int seat) {
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == true) {
				System.out.print("[X]\t");
			} else {
				System.out.print("[" + (i + 1) + "]\t");
			}
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
		}
//		for (int i = 0; i < seats.length; i++){
//				if (i == 4 || i == 9 || i == 14) { 
//				System.out.print("[" + seats[i] + "]  " + "\n");
//		}else 
//				System.out.print("[" + seats[i] + "]\t");
//		}	
//		System.out.println();	
//add new function PlanUpdate() *optional*
	public static int buyTicket() { //Add return value which is the chosen seat and insert that number into seatPlan()
		System.out.println("****** BUY ******");
		Scanner inputSeat = new Scanner(System.in);
		System.out.print("Enter seat number: ");
		int seatNum = inputSeat.nextInt();
//		int seat = 0;
//		if (seatNum >= 1 && seatNum <=20 ){
//				System.out.println("Thank you for booking the concert");
//				System.out.println("Seat #" + seatNum + " is booked.");
//		}else if ( seatNum > 20 || seatNum < 1) {
//			System.out.println("Sorry, the entered seat number is not valid.");
//		} 
	check(seatNum, seats);
		return seatNum;
	}
	
	public static void check(int seatNum, boolean[] Seats) {
		if (Seats[seatNum - 1] == false) {
			System.out.println("Thank you for booking the concert");
			System.out.println("Seat #" + seatNum + " is booked.");
		} else {
			System.out.println("Sorry the seat is not available");
		}
	}
//	
//	
	public static void payNow() { //Receive number of seats and calculate the price
		int seatNum = 0;
		double priceRow1 = 399.99;
		double priceRow2 = 299.99;
		double priceRow3 = 199.99;
		double priceRow4 = 99.99;
		
	
			if (seatNum >0 && seatNum < 6) {
				System.out.println("You have booked seat #" + seatNum +": " + " $" + priceRow1 );
			} else if ( seatNum> 5 && seatNum < 11 ) {
				System.out.println("You have booked seat #" + seatNum + ": " + " $" + priceRow2);
			} else if ( seatNum > 10 && seatNum < 16) {
				System.out.println("You have booked seat #" + seatNum + ": " + " $" + priceRow3);
			} else if ( seatNum > 15 && seatNum < 21) {
				System.out.println("You have booked seat #" + seatNum + ": " + " $" + priceRow4);
			}
		}
		//row1 (1-5) cost $399.99
		//row2 (6-10) cost $299.99
		//row3 (11-15) cost $199.99
		//row4 (16-20) cost $99.99
	public static void concertInfo() {
		System.out.println("**********************************************");
		System.out.println("Stamford Concert is organized by STIU All Star");
		System.out.println("  The booking system is created by Punyanuch  ");
		System.out.println("**********************************************");
	} 
}

