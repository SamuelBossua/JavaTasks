import java.util.Scanner;

public class MenstrualApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter last period day (number): ");
        int lastPeriod = input.nextInt();

        System.out.print("Enter cycle length ");
        int cycleLength = input.nextInt();

        System.out.print("Enter period duration: ");
        int periodDays = input.nextInt();

        int nextPeriod = lastPeriod + cycleLength;
        int ovulation = nextPeriod - 14;

        int fertileStart = ovulation - 5;
        int fertileEnd = ovulation + 1;

        System.out.println("\n..... RESULTS ......");
        System.out.println("Next Period Day: " + nextPeriod);
        System.out.println("Ovulation Day: " + ovulation);
        System.out.println("Fertile Window: Day " + fertileStart + " to Day " + fertileEnd);

        System.out.println("Safe Days: Before day " + fertileStart + " and after day " + fertileEnd);
    }
}