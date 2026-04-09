import java.util.Scanner;
public class SumUserLoop {
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int number = input.nextInt();
       int i = 0;
       int sum = 0;
       while( i <= number){
        sum = i + sum;

       i++;
       System.out.println("The sum is:" + sum);

}







}
}