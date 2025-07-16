import java.util.Scanner;
 public class AirplaneV {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter speed(v):");
 double num1 = input.nextDouble();
  System.out.println("Enter acceleration(a):");
 double num2 = input.nextDouble();
double length = (num1 * num1) / (2 * num2);
 System.out.println("The minimum runaway length for this airplane is " + length);
 }
 }