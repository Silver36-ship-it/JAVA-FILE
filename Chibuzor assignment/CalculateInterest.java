import java.util.Scanner;
 public class CalculateInterest {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter balance:");
 double num1 = input.nextDouble();
  System.out.println("Enter interest rate:");
 double num2 = input.nextDouble();
  double annual = (num2 / 1200);
 double interest = num1 * annual;
  System.out.println("The interest is " + interest);
  }
  }
