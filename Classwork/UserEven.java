import java.util.Scanner;
public class UserEven {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int result = 1;
System.out.println("Enter number:");
int number = input.nextInt();
for(; number != 0; number--) {

	if(number % 2 == 0){
	result = result * number;

	System.out.println("Even numbers are " + number);
	}
}
System.out.println("Product of the number is " + result);

}
}
