import java.util.Scanner;

public class PerfectSquare {

    public static boolean perfectSquare(int number) {
        int root = (int) Math.sqrt(number);

        if (root * root == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println(perfectSquare(number));
    }
}