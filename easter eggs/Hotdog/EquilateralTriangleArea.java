import java.util.Scanner;
public class EquilateralTriangleArea {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter a length: ");

       int number = input.nextInt();

       double area = (Math.sqrt(3)/4) * number * number;
       System.out.println("The area of the equilateral triangle is:" +  area );













}
}
