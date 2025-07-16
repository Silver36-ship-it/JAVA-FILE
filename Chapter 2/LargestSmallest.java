import java.util.Scanner;
 public class LargestSmallest {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter an Integer:");
   int number1 = input.nextInt();
  System.out.println("Enter an Integer:");
   int number2 = input.nextInt();
  System.out.println("Enter an Integer:");
   int number3 = input.nextInt();
  System.out.println("Enter an Integer:");
   int number4 = input.nextInt(); 
  System.out.println("Enter an Integer:");
   int number5 = input.nextInt();
     int largest = number1;
     int smallest = number3;
    if(largest < number2) largest = number2;
    if(largest < number3) largest = number3;
    if(largest < number4) largest = number4;
    if(largest < number5) largest = number5;
   System.out.println("The largest number is:" + largest);
    if(smallest > number1) smallest = number1;
    if(smallest > number2) smallest = number2;
    if(smallest > number4) smallest = number4;
    if(smallest > number5) smallest = number5;
   System.out.println("Smallest number here is:" + smallest);
    }
    }
   