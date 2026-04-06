import java.util.Scanner;
public class Energy {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter amount of water: ");

       int amount = input.nextInt();
       System.out.println("the amount is: " + amount + " kg");

       System.out.println("Enter initial temperature: ");
       int initial = input.nextInt();
       System.out.println("the temperature is " + initial + " o^c");



       System.out.println("Enter final temperature: ");
       int finalTemp = input.nextInt();
       System.out.println( "the temperature is " + finalTemp + " o^c");





       int energy = amount * (finalTemp - initial) * 4184;
       System.out.println("the energy is :" +  energy + " joules" );













}
}
