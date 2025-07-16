import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int number;
int number1;
int number2;
int sum = 0;
do {
     System.out.println("Enter a number:");
      number = input.nextInt();
      
      System.out.println("Enter a number:");
      number1 = input.nextInt();
      
    sum = number + number1;
     System.out.println("Sum is " + sum);
     
     
    System.out.println("Do you wish to continue? press 0:");
         number2 = input.nextInt();
         
     } while (number2 == 0);
       sum = number + number1;
     System.out.println("Thank you, Your total Sum is " + sum);
     
     }
     }

       
     

     
    
    
      
      
      
  
