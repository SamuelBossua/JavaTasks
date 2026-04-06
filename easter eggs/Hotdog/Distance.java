import java.util.Scanner;
public class Distance {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter a velocity: ");

       int velocity = input.nextInt();
       System.out.println("the velocity is " + velocity + " m/s");

       System.out.println("Enter a time: ");
       int time = input.nextInt();
       System.out.println("the time is " + time + " seconds");



       System.out.println("Enter an acceleration: ");
       int acceleration = input.nextInt();
       System.out.println( "the acceleration " + acceleration + " m/s^2");





       int distance = (velocity * time) + ((acceleration/2) * time * time);
       System.out.println("The distance is :" +  distance + " m" );













}
}
