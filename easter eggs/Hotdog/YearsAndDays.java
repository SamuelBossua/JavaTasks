import java.util.Scanner;
public class YearsAndDays {
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.print("enter a number of minutes: ");
       long minutes = input.nextLong();
       long days = minutes / (60*24);
       long years = days/365;
       long remainingDays = years % 365;

       System.out.println(minutes + " is " + "approximately " + years + "years" + " and " + remainingDays + " days");















}
}