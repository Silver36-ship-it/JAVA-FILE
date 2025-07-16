import java.util.Scanner;
public class GenRandom{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int genNumber = (int) (Math.random() * 10);
int guess = 0;
while(guess != genNumber) {
System.out.println("Choose between 0 and 10:");
                   guess = input.nextInt();
if (guess > genNumber) 
System.out.println("generated number" + genNumber + " Too high,try again");

else if (guess < genNumber)
System.out.println("generated number" + genNumber +  "Too low,try again");

else
System.out.println("generated number" + genNumber + " You are Correct");

}
}
}




