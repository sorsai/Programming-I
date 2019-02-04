import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args)
			throws FileNotFoundException {
		File file = new File("data.txt");
	Scanner console = new Scanner(file);
//	int gpa = console.nextInt();
//	System.out.println(gpa);
//	 String word = console.next();
//	System.out.println(word);
	int current = console.nextInt(); // create current variable
	int next = 0; 
	
		while(console.hasNext()) {
			next = console.nextInt();
		System.out.println(current + " - " + next + " = " + (current-next));
		current = next;
		}
		// 23 98 45 78 34 12
		// 23 - 98 = ..
		
	}
}
