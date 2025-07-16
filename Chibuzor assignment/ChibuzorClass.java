import java.util.Scanner;
 public class ChibuzorClass {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.print("Enter weight in pounds:");
 double number1 = input.nextDouble();
  System.out.print("Enter height in inches:");
 double number2 = input.nextDouble();
  double weight = 0.45359237 * number1;
  double height = 0.0254 * number2;
   double BMI = weight / (height * height);
  System.out.println("BMI is "  + BMI);
  }
  } 