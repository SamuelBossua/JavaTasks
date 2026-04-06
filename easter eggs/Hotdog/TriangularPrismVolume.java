import java.util.Scanner;
public class TriangularPrismVolume {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter a length: ");

       int number = input.nextInt();

       double area = (Math.sqrt(3)/4) * number * number;
       double volume = area * number;
       int approx = ((int)(volume));
       System.out.println("The volume of the triangular prsism is:" +  approx );













}
}
