import java.util.Scanner;
public class MileToKilometerConverter {
       public static void main(String[] args){

             Scanner input = new Scanner(System.in);
             System.out.println("Enter a number in miles: "); 

             int number = input.nextInt();
             double kilometer = number * 1.6;
             
             System.out.println("The value in kilometers is: " + kilometer + "km");















}
}