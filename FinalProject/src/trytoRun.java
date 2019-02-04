	import java.util.*;
	
	public class trytoRun {
		static boolean seats[] = new boolean[20];

		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			menu();
			System.out.print("Enter number please: "); //let user select the option
			int user = console.nextInt();
			while (user != -1) {
				//I use switch in order to select the option 
				//and it will call each method depending on which option the user choose
				switch (user) { 
				case 1:
					seatPlan(user);
					break;
				case 2:
					seats[buyTicket(seats)] = true;
					break;
				case 3:
					payNow();
					break;
				case 4:
					concertInfo();
					break;
				default:
					System.out.println("Please enter 1-3 or -1 to exit only");
					break;
				}
				menu();
				System.out.print("Enter number please: ");
				user = console.nextInt();
			}

		}
	//Print the menu
		public static void menu() {
			System.out.println("*********************************");
			System.out.println("*********** Concert *************");
			System.out.println("*********************************");
			System.out.println("1. Seat plan");
			System.out.println("2. Buy ticket");
			System.out.println("3. Developer Info");
			System.out.println("-1 to exit");
		}
	// Print the seat plan by using the array to collect the number
		// when the user input the number, check the boolean of the array 
			//if it true print X instead of the number
		//Aj.Mintra help me to do this blog of code :)
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
	// let the user input the seat number
		public static int buyTicket(boolean[] seatsArray) {
			Scanner console = new Scanner(System.in);
			System.out.println("****** Buy ******");
			System.out.print("Enter seat number: ");
			int seat = console.nextInt();
			checkAvailbility(seat, seatsArray);
			
			return seat - 1;
		}
	// check whether the seat is available or not if yes print the seat number 
		//or else print the message that it is not available
		public static void checkAvailbility(int seat, boolean[] seatsArray) {
			if (seatsArray[seat - 1] == false) {
				System.out.println("Thank you for booking the concert");
				System.out.println("Seat #" + seat + " is booked.");
			} else {
				System.out.println("Sorry the seat is not available");
			}

		}
		
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
		
	//Print the developer information
		public static void concertInfo() {
			System.out.println("**********************************************");
			System.out.println("Stamford Concert is organized by STIU All Star");
			System.out.println("  The booking system is created by Punyanuch  ");
			System.out.println("**********************************************");
		}

	}
