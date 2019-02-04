
public class CountingDown {
public static void main(String[] args) {
	int today = 13;
	int newyear = 31;

	System.out.println("Counting down to New Year!");
	for (int i = (newyear - today); i >= 1; i-- ){
		if ( i >1){
	System.out.println(i + "  days left.");	
		} else if ( i <= 1){
	System.out.println(i + "  day left.");
		}
}
	System.out.println(" Happy New year!! ");
}
}

