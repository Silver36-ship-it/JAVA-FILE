import java.util.Scanner;
 public class CostDriving {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.print("Enter the driving distance:");
 double number1 = input.nextDouble();
System.out.print("Enter miles per gallon:");
 double number2 = input.nextDouble();
 System.out.print("Enter price per gallon:");
 double number3 = input.nextDouble();
 double total = (number1 * number2) / number3;
 System.out.print("The cost of driving is "  + total);
 }
 }

