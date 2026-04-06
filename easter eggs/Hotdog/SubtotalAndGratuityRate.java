import java.util.Scanner;
public class SubtotalAndGratuityRate {
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       System.out.println("Enter the value of the subtotal: ");
       int subtotal = input.nextInt();
       System.out.println("the subtotal is: " + subtotal + "$");




       System.out.println("Enter a gratuity rate");
       int gratuityRate = input.nextInt();
       System.out.println("the gratuity rate is: " + gratuityRate + "%");

       double gratuity = subtotal * ((double)gratuityRate / 100);
       
       double total = gratuity + subtotal;
       System.out.println("the gratuity is " + "$ " + gratuity + " and the total is " + "$" + total);


}
}