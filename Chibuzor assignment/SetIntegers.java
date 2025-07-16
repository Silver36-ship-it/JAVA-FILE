import java.util.Scanner;
 public class SetIntegers {
  public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter an Integer:");
 int numb1 = input.nextInt();
  System.out.println("Enter an Integer:");
 int numb2 =  input.nextInt();
  System.out.println("Enter an Integer:");
 int numb3 = input.nextInt();
  System.out.println("Enter an Integer:");
 int numb4 = input.nextInt();
  System.out.println("Enter an Integer:");
 int numb5 = input.nextInt();
 //For Even numbers
  if(numb1 % 2 == 0 || numb2 % 2 == 0 || numb3 % 2 == 0 || numb4 % 2 == 0 || numb5 % 2 == 0) {
   System.out.println("These numbers are Even number");
    } 
    else {
    System.out.println("They are odd numbers");
    }
      }
  }