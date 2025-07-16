import java.util.Scanner;
public class TwoPower{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter number:");
int number = input.nextInt();
System.out.println("Enter the power:");
int power = input.nextInt();
int result = 1;
while(power != 0){
result = result * number;

power--;
}
System.out.println(number + " raised to power is " + result);
}
} 
