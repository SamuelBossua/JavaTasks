import java.util.Scanner;
public class TakeOff {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter a velocity: ");

       int velocity = input.nextInt();
       System.out.println("the velocity is " + velocity + " m/s");

      

       System.out.println("Enter an acceleration: ");
       int acceleration = input.nextInt();
       System.out.println( "the acceleration " + acceleration + " m/s^2");





       int length = (velocity * velocity) / (2 * acceleration);
       System.out.println("The length is :" +  length + " m" );













}
}
