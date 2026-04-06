import java.util.Scanner;
public class SqrMetersToPingConverter {
       public static void main(String[] args){

             Scanner input = new Scanner(System.in);
             System.out.println("Enter a value in  sqr meters: ");

             int number = input.nextInt();
             double meters = number * 0.3025;
             int approx = ((int) meters);
             System.out.println("The value of the number in pings is: " +  approx + "pings" );













}
}
