import java.util.Scanner;
public class AgeRestriction{
public static String age_restriction(int age_limit){
if(age_limit >= 10){
	return "Welcome to the show!";
	}
 else if(age_limit < 10){
 	return "Sorry,you are too young!";
 	}
 else
 	return "Invalid input";
 	}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("What is your age: ");
int user_input = input.nextInt();
System.out.println(age_restriction(user_input));
}
}
