          import java.util.Scanner;
     public class ComparingIntegers {
  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    System.out.println("Put an integer:");
    int number = input.nextInt();
   int square = number * number ;
   System.out.println("The number inserted is:" + number) ;
   System.out.println("The sqaure is:" + square) ;
   if(number > 100) {
   System.out.println("The number is Greater than 100.") ;
   }
    if(number < 100) {
   System.out.println("The number is less than 100.") ;
   }
    if(number != 100) {
   System.out.println("The number is not equal to 100") ;
    }
   if(number == 100) {
    System.out.println("The number is equal to 100.") ;
    }
   if(square > 100) {
    System.out.println("The Square is Greater than 100.") ;
    }
   if(square < 100) {
    System.out.println("The Square is less than 100.") ;
    }
   if(square != 100) {
    System.out.println("The Square is not equal to 100.") ;
    }
     if(square == 100) {
    System.out.println("The Square is equal to 100.") ;
    }
}
}