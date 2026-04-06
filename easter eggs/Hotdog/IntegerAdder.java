import java.util.Scanner;
public class IntegerAdder {
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       System.out.println("Enter an integer between 0 and 1000: ");
       int number = input.nextInt();
       int sum = 0;
       while(number > 0){
             int lastDigit = number % 10;
             number = number/10;
             sum = sum + lastDigit;

}


             System.out.println("The sum of all digits in the integer is: " + sum);

}
}