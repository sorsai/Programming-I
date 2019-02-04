import java.util.*;

public class TRY{
public static void main(String [] args) {
	
	Scanner bank = new Scanner (System.in);
	System.out.print("Enter money :  ");
	int x = bank.nextInt();	
	
	
	
	int remain;
	int m1000 = (x/1000);
	remain = x % 1000;
	
	int m500 = (remain/500);
	remain = remain%500;
	
	int m100 = (remain/100);
	remain  = remain%100;
	
	int m50 = (remain/50);
	remain = remain%50;
	
	int m20 = (remain/20);
	remain = remain%20;
	
	int m10 = (remain/10);
	remain = remain%10;
	
	int m5 = (remain/5);
	remain = remain%5;
	
	int m1 = (remain/1);

	System.out.println("============ The Bank ============");
	System.out.println("No. of 1000THB banknote :" + m1000 );
	System.out.println("No. of  500THB banknote :" + m500);
	System.out.println("No. of  100THB banknote :" + m100);
	System.out.println("No. of   50THB banknote :" + m50);
	System.out.println("No. of   20THB banknote :" + m20);
	System.out.println("No. of   10THB banknote :" + m10);
	System.out.println("No. of    5THB banknote :" + m5);
	System.out.println("No. of    1THB banknote :" );
	
}
	

}

