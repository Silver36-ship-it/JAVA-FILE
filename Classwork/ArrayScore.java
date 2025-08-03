  import java.util.Scanner;
public class ArrayScore{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
 int[] number = new int[5]; 
for(int i = 0; i <= 4; i++){
System.out.println("Enter score:");
 number[i] = input.nextInt();
 
}
System.out.println(number[2]);
}
}
