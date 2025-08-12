import java.util.Scanner;
public class TrafficLight{
public static String traffic_light(String colors){
final String color_red = "red";
final String color_green = "green";
if(colors.equalsIgnoreCase(color_red)) {
return "Stop!";
}
else if(colors.equalsIgnoreCase(color_green)){
	return "Go!";
	}
else if(colors.equalsIgnoreCase("yellow")){
	return "Wait!";
	}
else 
	return "Invalid input";
}

public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a color? Red or Green: ");
String user_input = input.nextLine();
System.out.println(traffic_light(user_input));
}
}