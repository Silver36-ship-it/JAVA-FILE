import java.util.Scanner;
public class EvenOrOdd{
public static String even_or_odd(int numbers){
if(numbers % 2 == 0)
return "Even!";
else if(numbers % 2 != 0)
return "Odd!";
else
	return "Invalid input";
	}
	
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter number: ");
int user_input = input.nextInt();
System.out.println(even_or_odd(user_input));
}
}