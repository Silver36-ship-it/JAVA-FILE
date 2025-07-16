import java.util.Scanner;
 public class ArithmeticSmallLargest {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter an Integer:");
 int number1 = input.nextInt();
  System.out.println("Enter another Integer:");
 int number2 = input.nextInt();
  System.out.println("Enter another Integer:");
   int number3 = input.nextInt();
  int sum = number1 + number2 + number3 ;
  int average = sum / 3 ;
  int product = number1 * number2 * number3 ;
  int smallest = number1 ;
  int largest = number1 ; 
  System.out.println("Sum is:" + sum);
  System.out.println("Average is:" + average);
  System.out.println("product is:" + product);
  if(smallest > number2) smallest = number2;
  if(smallest > number3) smallest = number3;
  System.out.println("Smallest is:" + smallest);
  if(largest < number2) largest = number2;
  if(largest < number3) largest = number3;
  System.out.println("Largest is:" + largest);
  }
  }
  