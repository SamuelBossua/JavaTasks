import java.util.Scanner;
public class AddNumbers {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");

int number = input.nextInt();
int sum = 0;
int remainder = 0;

for( ; number > 0 ;){

 remainder = number % 10;
sum+= remainder;
number = number / 10;

}

System.out.println("The sum is:" + sum);







}

}