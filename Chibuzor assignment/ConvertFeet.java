import java.util.Scanner;
 public class ConvertFeet {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.print("Enter a value for feet:");
 double number = input.nextDouble();
  double meters = 0.305 * number;
   System.out.println(number + "feet  is "  + meters + "meters");
  }
  } 

