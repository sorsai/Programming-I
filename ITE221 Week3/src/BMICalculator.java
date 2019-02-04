import java.util.Scanner;

public class BMICalculator {
public static void main(String[]args){
	
	double height; //meter
	double weight; // kg
	double bmi; 
	
	//compute BMI
	Scanner console = new Scanner(System.in);
	System.out.println("Enter your height (meter) :");
	height = console.nextDouble();
	
	System.out.println("Enter your weight (kg): ");
	weight = console.nextDouble();
	
	System.out.println("Current BMI:  ");
	bmi = weight / (height * height);
	System.out.printf("%.2f%n", bmi);

}
}