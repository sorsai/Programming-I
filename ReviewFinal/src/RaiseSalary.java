import java.util.Scanner;
public class RaiseSalary {
	public static double raiseSalary (double salary, int yearExperience) {
		return raiseSalary(salary, yearExperience);	
	}
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
			System.out.print("Enter your current salary:  ");
				double salary = input.nextDouble();
		
			System.out.print("Enter years of experience:  ");
				double yearExperience = input.nextDouble();
			
				double newSalary = salary * yearExperience * 0.25;
				double newSala = newSalary + salary;
			System.out.println("Your new salary: " + newSala );
	
		}				
	
}

	