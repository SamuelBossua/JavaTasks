import java.util.Scanner;

public class Interest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance: ");
        double balance = input.nextDouble();

        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);

        System.out.println("The interest for the next month is: " + interest);
}
}