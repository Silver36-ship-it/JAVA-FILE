import java.util.Scanner;
 public class Multiples {
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
   System.out.println("Enter an Integr:");
  int number1 = input.nextInt();
    System.out.println("Enter an Integer:");
   int number2 = input.nextInt();
  int FirstTripled = number1 * 3;
  int SecondDoubled = number2 * 2;
 if(FirstTripled % SecondDoubled == 0){
  System.out.println("First number when tripled "+ FirstTripled + " is a multiple of the second number doubled " + SecondDoubled + " ");
  }
   if(FirstTripled % SecondDoubled != 0){
  System.out.println("First number when tripled "+ FirstTripled + " is not a multiple of the second number doubled " + SecondDoubled + " ");
  }
  }
  }