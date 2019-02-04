import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FinalProject {
	static String[] seats = new String[20];
	public static void main(String[] args) {
		System.out.println("******* Welcome to Stamford Concert *******");
		System.out.println("*******************************************");
		//User input the menu number
		Scanner console = new Scanner(System.in);
		System.out.print("What's your name? ");
		String userName = console.next();
		int menu = 0;
		for (int i = 0; i < seats.length;i++) {
		seats[i] = i + 1 + "";
		}
		// for keep asking until user type -1
		do {
			System.out.println();
			GregorianCalendar time = new GregorianCalendar();
			int hour = time.get(Calendar.HOUR_OF_DAY); 
			if (hour < 12) {
				   System.out.println("Good Morning! " + userName + ". How can I help you?") ;
			}  else if (hour < 17 && hour >=12 ){
				   System.out.println("Good Afternoon! " + userName + ". How can I help you?");
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
				seatPlan();
			} else if (menu == 2) {
				buyTicket(); //keep return value into variable and input into seatPlan();
			} else if (menu == 3) {
				payNow(menu);
			} else if (menu == 4){
				concertInfo();
				} 
			}		
		while (menu != -1);  //program will end when user type -1	
						System.out.println("Thank you!! Hope to see you soon");
		}
	public static void seatPlan() { // display seat
		for (int i = 0; i < seats.length; i++){
			if (i == 4 || i == 9 || i == 14) { 
				System.out.print("[" + seats[i] + "]  " + "\n");
			}else 
				System.out.print("[" + seats[i] + "]\t");
		}	
		System.out.println();
	}
	public static void buyTicket() { //Add return value which is the chosen seat and insert that number into seatPlan()
		System.out.println("****** BUY ******");
		Scanner inputSeat = new Scanner(System.in);
		System.out.print("Enter seat number: ");
		int seatNum = inputSeat.nextInt();
		if( seatNum > 20 || seatNum < 1) {
			System.out.println("Sorry, the entered seat number is not valid.");
			} else {
					if ( seats[seatNum - 1] != "X"){
						System.out.println("Thank you for booking the concert");
						System.out.println("Seat #" + seatNum + " is booked.");
						seats[seatNum - 1] = "X";
				}
					else if( seats[seatNum - 1] == "X" ) {
						System.out.println("Sorry the seat is not available");
				}
		}
	
	}	
	public static void payNow(int seatNum) { //Receive number of seats and calculate the price
		int count = 0;
		int count2 = 0;
		int count3= 0;
		int count4 = 0;
		double row1 = 399.99;
		double row2 = 299.99;
		double row3 = 199.99;
		double row4 = 99.99;	
		double total;
		// find how many x appears, and calculate the price
		for (int i = 0; i < seats.length ; i++) {	
			if ( seats[i] == "X" && seatNum >= 1  && seatNum <= 5 ) {
				count = count + 1;
				System.out.println("You have booked seat #" + (i+1) + ":    $" + row1 );
		}	else if ( seats[i] == "X" && seatNum >= 6 && seatNum <= 10) {
				count2 = count2 +1;
				System.out.println("You have booked seat #" + (i+1) + ":    $" + row2);				
		}	else if (  seats[i] == "X" && seatNum>= 11 && seatNum <= 15 ) {
				count3 = count3 +1;
				System.out.println("You have booked seat #" + (i+1) + ":    $" + row3);
		} 	else if ( seats[i] == "X" && seatNum >= 16 && seatNum <= 20 ) {
				count4 = count4 +1;
				System.out.println("You have booked seat #" + (i+1) + ":    $" + row4);
			}
		}
		total = count*row1 + count2*row2 + count3*row3 + count4*row4;
		System.out.println("=========================================");
		System.out.println("         Total Price :    $"   +   total  );
		System.out.println("=========================================");
	}
	//display information of the concert
	public static void concertInfo() {
		System.out.println("**********************************************");
		System.out.println("Stamford Concert is organized by STIU All Star");
		System.out.println("  The booking system is created by Punyanuch  ");
		System.out.println("**********************************************");
	} 
}
