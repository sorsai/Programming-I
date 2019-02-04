
public class MethodBoxTest {
	public static void main(String[] args) {
		printStar(13, "Tiffany", 'A');  // called caller and print 13
		printStar(7,"Taeyeon",'C'); // print 7
		printStar(30, "Yoona", 'D'); // print 30
		box(5,4);
		box(20,5);
	}
	public static void printStar(int num, String name, char grade) {
		//13 stars
		for (int i = 1; i <= num ; i++) {
		System.out.print("*");
		}
		System.out.print(name);
		System.out.print(" got " + grade);
		System.out.println();
	}
	public static void box (int width, int height) {
		line(width);
			for (int i = 1; i <= height ; i++) {
				System.out.print("*");
			for ( int j = 1; j <= width-2 ; j++) {
				System.out.print(" ");
			}
				System.out.println("*");
			}
		line(width);
	}
	public static void line (int n) {
		for ( int i = 1; i <= n ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}