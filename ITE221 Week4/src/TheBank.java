import java.util.*;

public class TheBank {
public static void main(String[] args) {
	
	
	Scanner number = new Scanner (System.in);{
	System.out.print("Enter money  :  ");
	int x = number.nextInt();
		
	System.out.println("============ The Bank ============");
	
	int remain ;
	int m1000 = (x/1000);
	remain = x % 1000;
	System.out.println("   No. of 1000THB banknote :" + m1000 );
	
	int m500 = remain/500;
	remain = remain % 500;
	System.out.println("   No. of  500THB banknote :" + m500);
	
	int m100 = (remain/100);
	remain = remain % 100;
	System.out.println("   No. of  100THB banknote :" + m100);
	
	int m50 = (remain/50);
	remain = remain % 50;
	System.out.println("   No. of   50THB banknote :" + m50);
	
	int m20 = (remain/20);
	remain = remain % 20;
	System.out.println("   No. of   20THB banknote :" + m20 );
	
	int m10 = (remain/10);
	remain = remain % 10;
	System.out.println("   No. of   10THB coin     :" + m10 );
	
	int m5 = (remain/5);
	remain = remain % 5;
	System.out.println("   No. of    5THB coin     :" + m5 );
	
	int m1 = remain;
	System.out.println("   No. of    1THB coin     :" + m1);
	
	System.out.println("==================================");
    }
}
}