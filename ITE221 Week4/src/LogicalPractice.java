
public class LogicalPractice {
public static void main(String [] args){
   int x = 42;
   int y = 17;
   int z = 25;
   
 System.out.println(y < x && y <= z);
 System.out.println( x % 2 == y % 2 || x % 2 == z % 2);
 System.out.println(x <= y && x >= y + z);
 System.out.println(!( x < y && x < z ));
 System.out.println((x + y) % 2 == 0 || !((z - y) % 2 == 0));
   

}
}