import java.util.Scanner;
public class CostOfDriving {
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       System.out.println("Enter a distance: ");
       int distance = input.nextInt();
       System.out.println("Enter the fuel efficiency: ");
       int fuelEfficiency = input.nextInt();
       System.out.println("Enter the price: ");
       int price = input.nextInt();
       
       double cost = (distance/fuelEfficiency) * price;

       System.out.println("The cost of driving is: " + " $" + price);



















}
}