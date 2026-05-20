import java.util.Scanner;
public class SquareTask {
public static void main(String[] args){


Scanner input = new Scanner(System.in);
System.out.print("Enter an integer: ")

int UserInput = input.nextInt();
for( ; UserInput>0 ;){
remainder = userInput % 10;
sum+= remainder;
userInput = UserInput / 10;






}


System.out.println(sum * sum);


}

}