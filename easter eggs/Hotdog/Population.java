import java.util.Scanner;
public class Population {
       public static void main(String[] args){


       Scanner input = new Scanner(System.in);
       System.out.println("current population is: 312_032_486");
       int currentPopulation = 312032486;
       int secondsPerYear = 365 * 24 * 60 * 60;
       int birthsPerYear = secondsPerYear/7;
       int deathsPerYear = secondsPerYear/13;
       int immigrantsPerYear = secondsPerYear/45;
       
       for(int i = 1; i<=5; i++){
           currentPopulation = currentPopulation + (birthsPerYear - deathsPerYear) + immigrantsPerYear;



           System.out.println("Year "+ i + ":" +  currentPopulation);
}
}
}
