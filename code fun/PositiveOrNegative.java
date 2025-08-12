import java.util.Scanner;
public class PositiveOrNegative{
public static String positive_or_negative(int number){
if(number > 0){
return "Positive";
}
else if(number <= 0){
return "Negative or zero";
}
else
	return "Invalid input";
}	

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number: ");
int user_input = input.nextInt();
System.out.println(positive_or_negative(user_input));
}
}
