import java.util.Scanner;
public class MeterToFeetConverter {
       public static void main(String[] args){

             Scanner input = new Scanner(System.in);
             System.out.println("Enter a value in meters: ");

             int number = input.nextInt(  );
             double feet = number * 3.2786;
             int approx = ((int) feet);
             System.out.println("The value of the number in feet is: " +  approx + "feet" );













}
}
