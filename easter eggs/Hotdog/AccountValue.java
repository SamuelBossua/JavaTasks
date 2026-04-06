import java.util.Scanner;
public class AccountValue {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("Enter monthly saving amount:");
       double amount = input.nextDouble();
       double accountValue = 0;
       double monthlyInterestRate = 0.003125;
              
       for(int i = 1; i<=6; i++){
           accountValue = (accountValue + amount) * (1 + monthlyInterestRate);

           System.out.println("Month "+ i + ":" +  accountValue);
  }
 }
}
