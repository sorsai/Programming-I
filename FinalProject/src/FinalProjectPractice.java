import java.util.Scanner;

public class FinalProjectPractice {
	static String[] seats = new String[20];
	public static void main(String[] args) {	
		System.out.println("******* Welcome to Stamford Concert *******");
		System.out.println("*******************************************");
	
		Scanner console = new Scanner(System.in);
		System.out.print("What's your name? ");
		String userName = console.next();
		int menu = 0;
		int seatNum = 0;
		int selectSeat = 0;
		double priceRow1 = 399.99;
		double priceRow2 = 299.99;
		double priceRow3 = 199.99;
		double priceRow4 = 99.99;
		for (int i = 0; i < seats.length;i++) {
			seats[i] = i + 1 + "";
		}
		do {
			System.out.println();
			System.out.println("Hello, " + userName + ". How can I help you?");
			System.out.println("[1] Seat Plan");
			System.out.println("[2] Buy a ticket");
			System.out.println("[3] Pay now");
			System.out.println("[4] Concert Information");
			System.out.print("Press 1, 2, 3, 4 or -1 to exit: ");
			menu = console.nextInt();
			if (menu > 4 || menu == 0 || menu < -1 ) {
				System.out.println("Please press 1, 2, 3, 4 or -1 to exit only");
			} 
			
			if (menu == 1) {
					for (int i = 0; i < seats.length; i++){
					
						if (i == 4 || i == 9 || i == 14) { 
						System.out.print("[" + seats[i] + "]  " + "\n");
				}else 
						System.out.print("[" + seats[i] + "]\t");
				}	System.out.println();
				
				
			} 
			
			if (menu == 2) {
				System.out.println("****** BUY ******");
				Scanner inputSeat = new Scanner(System.in);
				System.out.print("Enter seat number: ");
				seatNum = inputSeat.nextInt();
				if (seatNum >= 1 && seatNum <=20 ){
						System.out.println("Thank you for booking the concert");
						System.out.println("Seat #" + seatNum + " is booked.");
			}else {
					System.out.println("Sorry, the entered seat number is not valid.");
				}
				
			} 
			// need all of the in
			if (menu == 3) {
//				double priceRow1 = 399.99;
//				double priceRow2 = 299.99;
//				double priceRow3 = 199.99;
//				double priceRow4 = 99.99;
					for ( int select = 0; select < seatNum ; select++) {
						if( seatNum < 6  && seatNum > 0) {
						System.out.println("You have booked seat #" + seatNum +": " + " $" + priceRow1 );
					} else if (seatNum < 11 && seatNum > 5){
						System.out.println("You have booked seat #" + seatNum +": " + " $" + priceRow2 );
					}else if(seatNum < 16 && seatNum > 10){
						System.out.println("You have booked seat #" + seatNum +": " + " $" + priceRow3 );
					}else if (seatNum < 21 && seatNum > 15){
						System.out.println("You have booked seat #" + seatNum +": " + " $" + priceRow4 );
					}
				//row1 (1-5) cost $399.99
				//row2 (6-10) cost $299.99
				//row3 (11-15) cost $199.99
				//row4 (16-20) cost $99.99
					}		
			} 
			
			if (menu == 4){
				System.out.println("**********************************************");
				System.out.println("Stamford Concert is organized by STIU All Star");
				System.out.println("  The booking system is created by Punyanuch  ");
				System.out.println("**********************************************");
			}
		}while (menu != -1);
			System.out.println("Thank you!! Hope to see you soon");
		}
	}

//	GregorianCalendar time = new GregorianCalendar();
//int hour = time.get(Calendar.HOUR_OF_DAY); 
//if (hour < 12) {
//	   System.out.println("Good Morning! " + userName + ". How can I help you?") ;
//	}  else if (hour < 17 && !(hour == 12)){
//	   System.out.println("Good Afternoon! " + userName + ". How can I help you?");
//	}  else if (hour == 12){
//	   System.out.println("Good Noon! " + userName + ". How can I help you?");
//	}  else{
//	   System.out.println("Good Evening! " + userName + ". How can I help you?");
//	}


	
		
	
		
	
	
	
	
	
	
	
		
	