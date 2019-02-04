import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		String[] emName = new String[3];
		int[] salary = new int[3];
	for ( int a = 0; a <3 ; a++ ){	
		Scanner console = new Scanner(System.in);
		System.out.print("Enter employee name: ");
		emName[a] = console.next();
		System.out.print("Enter employee salary: ");
		salary[a] = console.nextInt();
		System.out.println("-----------------------");
	}
		for(int i = 0; i < 3; i++){
		System.out.println(emName[i] + "'s salary is $" + salary[i]);
		//("%.1f")
		}
		System.out.println("-----------------------");
		double mean = (salary[0]+salary[1]+salary[2])/3 ;
		System.out.println("Average salary is $" + mean);
}
}
