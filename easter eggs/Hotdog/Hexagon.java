import java.util.Scanner;
public class Hexagon {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter length of side of hexagon: ");
       Double length = input.nextDouble();
       Double area = ((3 * Math.sqrt(3))/2) * length * length;

       System.out.println("Area of hexagon is: " + area + " m^2");














}
}