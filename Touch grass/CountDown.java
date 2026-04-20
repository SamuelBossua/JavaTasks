import java.util.Scanner;
public class CountDown {
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number for countdown seargent!: ");

  int number = input.nextInt();
   
   
   
  while (number >= 1) {
            System.out.println(number);
            number--;
        }

        System.out.println("Blast off!");




}


}