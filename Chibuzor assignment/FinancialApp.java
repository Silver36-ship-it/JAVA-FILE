import java.util.Scanner;
 public class FinancialApp {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter investment amount:");
 double num1 = input.nextDouble();
  System.out.println("Enter annual interest rate in percentage:");
 double num2 = input.nextDouble();
  System.out.println("Enter number of years:");
 double num3 = input.nextDouble();
  double solve1 = num1 * (1 + (num2 / 100));
  double solve2 = num3;
  System.out.println("Accumulated value is $" + Math.pow(solve1, solve2));
  }
  }