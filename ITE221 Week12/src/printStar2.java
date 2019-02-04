import java.util.Scanner;

public class printStar2 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of stars: ");
		int star = console.nextInt();
		for (int i = 0; i < star ; i++) {
			for(int j = 1; j<i; j++) {
				System.out.print("*");
			}
		  System.out.println();
		  }
  }
}
		

