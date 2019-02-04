
   public class SnackBar {
   public static void main(String[] args) {
        String text = "Welcome to SorSai's Shop!";
        String text2 = "You have bought:";
        double number = Math.random() * 100;
        double floor = Math.floor(number);
        int mynumber = (int) floor;
        double Lay = 25.0  ;
        double Pepsi = 11.5;
        double subtotal = Lay + Pepsi;
        double tax = subtotal * .07;
        double total = subtotal + tax;

        System.out.println(text);
        System.out.println(text2);
        System.out.println("Lay Potato:     " + Lay + "  THB");
        System.out.println("Pepsi:          " + Pepsi + "  THB");
        System.out.println("-----------------------------------");
        System.out.println("Total:          " + total + "  THB" + "(7% VAT)" );
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("Lucky draw number: " + mynumber );	
	}
}
