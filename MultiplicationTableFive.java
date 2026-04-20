import java.util.Scanner;
public class MultiplicationTableFive {
        public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the multiplication table of 5: ");
        System.out.println("Which number would you like to multiply by 5 (from 1 -12): ");
        System.out.println("1. 1x5 = ");
        System.out.println("2. 2x5 = ");
        System.out.println("3. 4x5 = ");
        System.out.println("4. 4x5 = ");
        System.out.println("5. 5x5 = ");
        System.out.println("6. 6x5 = ");
        System.out.println("7. 7x5 = ");
        System.out.println("8. 8x5 = ");
        System.out.println("9. 9x5 = ");
        System.out.println("10. 10x5 = ");
        System.out.println("11. 11x5 = ");
        System.out.println("12. 12x5 = ");


        int number = input.nextInt();
          
        switch(number){

        case 1 : System.out.println("the result is: " + 5*1); 
        break; 
        case 2 : System.out.println("the result is: " + 5*2);  
        break;     
        case 3 : System.out.println("the result is: " + 5*3);
        break;
        case 4 : System.out.println("the result is: " + 5*4);
        break;
        case 5 : System.out.println("the result is: " + 5*5);
        break;
        case 6 : System.out.println("the result is: " + 5*6);
        break;
        case 7 : System.out.println("the result is: " + 5*7);
        break;
        case 8 : System.out.println("the result is: " + 5*8);
        break;
        case 9 : System.out.println("the result is: " + 5*9);
        break;
        case 10 : System.out.println("the result is: " + 5*10);
        break;
        case 11 : System.out.println("the result is: " + 5*11);
        break;
        case 12 : System.out.println("the result is: " + 5*12); 
        break;
        default : System.out.println("Sorry only numbers from 1-12 :(");
        break;








}

































}
      













}