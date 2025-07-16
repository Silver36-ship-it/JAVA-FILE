import java.util.Scanner;
 public class SeparatingInteger {
public static void main(String [] args) {
 Scanner input = new Scanner(System.in);
  System.out.println("Enter number:");
 int number = input.nextInt();
  int d1 = (number / 10000);
  int d2 = (number%10000) / 1000;
  int d3 = (number%1000) / 100;
  int d4 = (number%100) / 10;
  int d5 = number%10;
  System.out.printf("The digits are %d %d %d %d %d", d1, d2, d3, d4, d5);
 }
 }