import java.util.Scanner;
public class PositiveCount{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int positive = 0;
int negative = 0;
int zero = 0;
int number = 0;
while(number != -5){
System.out.print("Enter number,press -5 to exit:");
number = input.nextInt();
if(number > 0){
positive++;}
else if(number < 0){
negative++;}
else{
   zero++;}
   }
   System.out.println("Positive numbers " + positive);
   System.out.println("Negative numbers " + negative);
   System.out.println("Zero numbers " + zero);
   }
   
   }