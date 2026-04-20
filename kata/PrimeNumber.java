import java.util.Scanner;

public class PrimeNumber {

    public static boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (primeNumber(number)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
    }