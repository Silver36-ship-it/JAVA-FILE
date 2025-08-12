import java.util.Scanner;
public class PetChooser{
public static String pet_pick(String pet_name){
if(pet_name.equalsIgnoreCase("dog")) {
return "Woof!, Dogs are awesome!";
}
else 
	return "Cool choice, but i love dogs!";
}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Do you prefer dog or cat? ");
String user_input = input.nextLine();
System.out.println(pet_pick(user_input));
}
}