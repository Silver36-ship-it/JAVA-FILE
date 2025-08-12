import java.util.Scanner;
public class GreetingsChooser{
public static String guess_the_animal(String guess_animal){
String my_animal = "dog";
if(guess_animal.equalsIgnoreCase(my_animal)){
return "Correct! it is a dog!";
}
else
	return "Nope!, it is a dog";
	}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Guess animal name?: ");
String user_input = input.nextLine();
System.out.println(guess_the_animal(user_input));
}
}