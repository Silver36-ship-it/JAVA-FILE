import java.util.Scanner;
 public class CalculateEnergy {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter the amount of water in kilograms:");
 double num1 = input.nextDouble();
  System.out.println("Enter the initial temperature:");
 double num2 = input.nextDouble();
  System.out.println("Enter the final temperature:");
 double num3 = input.nextDouble();
  double energy = (num1 * (num3 - num2) * 4184) ;
   System.out.println("The energy needed is " + energy);
   }
   }