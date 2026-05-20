import java.util.Scanner;
public class Task {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");

int number = input.nextInt();

int remainder = 0;
int square = 1;

for( ; number > 0 ;){

 remainder = number % 10;

square = remainder * remainder;

System.out.println("The square is:" + square);

number = number / 10;


}





}

}