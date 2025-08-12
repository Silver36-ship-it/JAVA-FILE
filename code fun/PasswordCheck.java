import java.util.Scanner;
public class PasswordCheck{
public static String password_check(String password){
final String right_password = "secret123";
if(password.equalsIgnoreCase(right_password)) {
return "Access granted!, Welcome!";
}
else 
	return "Access denied!";
}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter password: ");
String user_input = input.nextLine();
System.out.println(password_check(user_input));
}
}