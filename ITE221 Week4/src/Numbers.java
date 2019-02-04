import java.util.*;

public class Numbers {
public static void main(String[] args) {
	 
	Scanner console = new Scanner(System.in);
	System.out.print("Please enter Number 1: ");
	int number1 = console.nextInt();
	
	System.out.print("Please enter Number 2: ");
	int number2 = console.nextInt();
	
	System.out.println("--------------------------");
	
	System.out.println("Your first number is " + number1);
	System.out.println("Your second number is " + number2);
	
	System.out.println("--------------------------");
	
	int Sum = number1 + number2;
	System.out.println("Sum is " + Sum );
	
	int avg = (number1 + number2)/2;
	System.out.println("Average is " + avg );
	
	System.out.println("--------------------------");
	
	if(number1 > number2){
		System.out.println("Number 1 is more than number 2");
	} else if (number1 < number2){
		System.out.println("Number 2 is more than number 1");
	} else {
		System.out.println("Number 1 and number 2 are eqaul");
	}
	
}
}
