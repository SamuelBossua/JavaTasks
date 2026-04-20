import java.util.Scanner;
public class NegativeAverage {
      public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number please: ");
      int number = input.nextInt();
      int total = 0;
      int counter = 0;
      double average = 0;

      while(number > -1 ){

      total+= number;
      System.out.print("Enter a number please: ");
      number = input.nextInt();

      counter++;
      
      if(number <= -1){

      average = total/counter;
      System.out.print("the average is: " + average );
    }

     

      
      




}

    






















}
}