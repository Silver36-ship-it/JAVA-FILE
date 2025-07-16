import java.util.Scanner
;
public class LargestSmall{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int largest = Integer.MIN_VALUE;
int smallest = Integer.MAX_VALUE;
System.out.println("Enter a number");
int number = input.nextInt();
while(number != 0){
System.out.println("Enter number:");
  number = input.nextInt();
if(number > largest){ largest = number;}
if(number < smallest){ smallest = number;}
}
System.out.print("Largest is" + largest);
System.out.print("Smallest is" + smallest);
}
}