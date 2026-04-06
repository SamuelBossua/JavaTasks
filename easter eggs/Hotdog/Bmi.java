import java.util.Scanner;
public class Bmi {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter a weight: ");

       double weight = input.nextDouble();
       System.out.println("the weight is " + weight + " pounds");

       System.out.println("Enter a height: ");
       double height = input.nextDouble();
       System.out.println("the height is " + height + " inches");



       double kilos = weight * 0.45359237;
       
       double meters = height * 0.0254;
 
       double bmi =  kilos/(meters * meters);     
       System.out.println("The bmi is :" +  bmi + " kg/m^2" );













}
}
