import java.util.*;

public class Grade {
public static void main(String[] args) {
	
	Scanner console = new Scanner(System.in);
	System.out.print("Enter Score : ");
	double score = console.nextInt();
	
	if( score >=80 && score <=100 ){
		System.out.println("You have got A!");
	} else if( score >=70 && score <80){
		System.out.println("You have got B!");
	} else if( score >=60 && score <70){
		System.out.println("You have got C!");
	} else if ( score >=50 && score <60){
		System.out.println("You have got D!");
	} else if (score <50 && score >=0 ){
		System.out.println("You have got F!");
	} else {
		System.out.println("Score out of range!");
	}	
}
}
