import java.util.Scanner;
 public class DivisibleBy {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in) ;
  System.out.println("Enter an Integer:");
   int number = input.nextInt() ; 
  if(number % 3 == 0) {
   System.out.println(number + " is divisible by 3");
   }
   if(number % 3 != 0) {
    System.out.println("The number " + number + ", is not divisible by 3");
    }
    }
    }