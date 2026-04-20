import java.util.Scanner;
public class ReverseNumber {
   public static void main(String[] args){


Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int reverse = input.nextInt();
int remainderOne = 0;


for( ; reverse > 0 ;){

remainderOne = reverse % 10;
System.out.print(remainderOne);

reverse /= 10;



}
}
}
