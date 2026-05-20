import java.util.Scanner;
public class ReverseNum {
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

int square = 1;
int remainderTwo = 0;

for ( ; remainderOne > 0; ){

remainderTwo = remainderOne % 10;
square = remainderTwo * remainderTwo;
System.out.println("The square is:" + square);
remainderOne/= 10;


}

























}

}