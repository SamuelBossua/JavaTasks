import java.util.Scanner;
public class TaskTwentySix {
     
       public static void main(String[] args){

          Scanner input = new Scanner(System.in);

          System.out.println("Hello what is your name?");

          String name = input.nextLine();
    
          System.out.println("How old are you?");
          
          int age = input.nextInt();
          
          System.out.println("I am " + name);
          System.out.println(" and I am " + age + " years old");

}



}