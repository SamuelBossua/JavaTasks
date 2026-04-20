import java.util.Scanner;
public class YearMajor {
   public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   System.out.println("Enter letters I   A  or  C ");
   char letter = input.next().charAt(0);
   System.out.println("Enter a number from 1 - 4 ");
   int number = input.nextInt();

   String major = "";
   String year = "";

   switch(letter ){

   case 'I' : major = "information management ";
   break;
   case 'A' : major = "Accounting"; 
   break;
   case 'C' : major = "Computer Science";
   break;
   default : System.out.print("Invalid major");
   return;


}
  
  switch(number){
   
  case 1 : year = "Freshman";
  break;
  case 2 : year = "Sophomore";
  break;
  case 3 : year = "Junior";
  break;
  case 4 : year = "Senior";
  break;
  default : System.out.println("Invalid year");
  return;



}


System.out.println("Major: " + major + " Year: " + year);

































}


}