import java.util.Scanner;

public class Square {

    public static long square(int number) {
        return (long) number * number;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Square: " + square(number));
    }
}