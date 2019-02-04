import java.util.*;

public class EvenOrOdd {
public static void main(String[] args) {
	
	Scanner Num = new Scanner(System.in);
	System.out.print("Enter number :  ");
	int number = Num.nextInt();
	
	//even have no remain if divided by even number
	if ( number%2 == 0){
		System.out.println(number + " is Even number");
	} 
	//odd have remain if divided by even number
	else{ 
		System.out.println(number + " is Odd number");
	}

}
}

