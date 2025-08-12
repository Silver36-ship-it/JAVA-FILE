import java.util.Scanner;
public class MagicNumber{
public static String magic_number(int number){
final int magic_number = 42;
if(number == magic_number){
return "You found the magic number!";
}
else
return "Keep looking!";
}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter number: ");
int user_input = input.nextInt();
System.out.println(magic_number(user_input));
}
}

