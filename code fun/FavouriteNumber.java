import java.util.Scanner;
public class FavouriteNumber{
public static String favourite_number(int guess_number){
final int number = 7;
if(guess_number == number) {
return "Thats my favourite number!";
}
else
	return "Nice try guess again!";
	}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Guess a number?: ");
int user_input = input.nextInt();
System.out.println(favourite_number(user_input));
}
}