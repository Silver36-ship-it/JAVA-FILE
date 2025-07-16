import java.util.Scanner;
 public class ConvertPounds {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter a number in pounds:");
 double numb = input.nextDouble();
  double kilo = 0.454 * numb;
  System.out.println(numb + " pounds is " + kilo + " kilograms");
  }
  }