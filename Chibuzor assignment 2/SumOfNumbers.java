import java.util.Scanner;
public class SumOfNumbers{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int sum = 1;
int calculate = 0;
while(sum < 11){
System.out.println("Enter number:");
int number = input.nextInt();
calculate = calculate + number;
sum++;
}
System.out.println("Sum is " + calculate);
}
}