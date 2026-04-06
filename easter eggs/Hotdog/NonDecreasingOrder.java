import java.util.Scanner;
import java.util.Arrays;
public class NonDecreasingOrder {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        
        System.out.println("The integers in non-decreasing order are: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
        
        
    }
}


























