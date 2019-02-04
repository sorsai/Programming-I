import java.util.Scanner;

public class Practice {
public static void main(String [] args){
	Scanner console = new Scanner(System.in);
	
	System.out.println("Welcome User");
	System.out.println("Please enter your name:  ");
	
	String name = null;
	name = console.nextLine();
	
	System.out.println("Welcome " + name);
	
	System.out.println("May I ask how old are you?");
	int age = 0;
	age = console.nextInt();
	
	String message = age >= 20 ?"Adult" : "Teenager";
	System.out.println(message);
	
	System.out.println("May I ask your status?");
	
	 
	
	
	
	
	
}
}