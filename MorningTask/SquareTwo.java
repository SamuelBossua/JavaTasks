import java.util.Scanner;
public class SquareTwo {
   public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
int square = 1;
int remainder = 0;

for( ; number > 0 ; ){

remainder = number % 10;
square = remainder * remainder;
System.out.println("The square is: " + square);
number/= 10;




}

























}

}
