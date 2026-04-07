import java.util.Scanner;
public class Gpa {
       public static void main(String[] args){

     Scanner input = new Scanner(System.in);  
     System.out.println("Enter a grade: ");
     double gpa = input.nextDouble();
     
     if(gpa >= 4.0){
        System.out.println("A");
}

    else if(gpa >= 3.0){
             System.out.println("B");
}

    else if(gpa >= 2.0){
            System.out.println("C"); 
} 

   else if(gpa >= 1.0){
            System.out.println("D");
}
   else {
        System.out.println("F");

}




}
}