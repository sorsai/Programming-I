import java.util.Scanner;

public class printStars {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of stars: ");
		int numStar = console.nextInt();
		for(int i = 0; i<numStar ;i++) {
			System.out.print("*");
		}
	}
}
