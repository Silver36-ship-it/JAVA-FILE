import java.util.Scanner;
public class Operands{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
float number = input.nextInt();
System.out.println("Enter type of operation: ");
char operation = input.next().charAt(0);
System.out.println("Enter a number: ");
float number1 = input.nextInt();
float sum = number + number1;
float subtraction = Math.abs(number - number1);
float multiplication = number * number1;
double division = number / number1; 
if (operation == '+'){
System.out.println("Answer is " + sum);}
else if (operation == '-'){
System.out.println("Answer is " + subtraction);}
else if (operation == '*'){
System.out.println("Answer is " + multiplication);}
else if (operation == '/'){
System.out.println("Answer is " + division);}
else{
System.out.println("Invalid input");}
}
}