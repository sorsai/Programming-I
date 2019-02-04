import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter keyword: ");
		PrintStream write = new PrintStream(new File("lorem.txt"));
		while (console.hasNextLine()) {
			String line = console.nextLine();
			Scanner lineScan = new Scanner(line);
			String name = lineScan.next();
			int count = 0;	
		System.out.print("Keyword Type is found " + name + " time(s)");
	}
}
}