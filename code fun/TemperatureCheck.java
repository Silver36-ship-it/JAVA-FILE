import java.util.Scanner;
public class TemperatureCheck{
public static String temp_check(int value){
if(value > 30){
return "Hot!";
}
else if(value >= 15 && value <= 30){
return "Nice!";
}
else if(value < 15){
return "Cold!";
}
else
	return "Invalid input";
}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter temperature value: ");
int user_input = input.nextInt();
System.out.println(temp_check(user_input));
}
}

