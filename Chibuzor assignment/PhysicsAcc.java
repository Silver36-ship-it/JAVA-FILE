import java.util.Scanner;
 public class PhysicsAcc {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter (v0):");
 double num1 = input.nextDouble();
  System.out.println("Enter (v1):");
 double num2 = input.nextDouble();
  System.out.println("Enter (t):");
 double num3 = input.nextDouble();
  double acceleration = (num2 - num1) / num3;
 System.out.println("The average acceleration is " + acceleration);
 }
 }
