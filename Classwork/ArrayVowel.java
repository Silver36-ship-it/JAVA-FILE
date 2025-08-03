import java.util.Scanner;
public class ArrayVowel{
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a word");
String wordInput = input.nextLine().toLowerCase();
int vowelCount = 0;
for (int counter = 0; counter < wordInput.length(); counter++){
if(wordInput.charAt(counter) == 'a' || wordInput.charAt(counter) == 'e' || wordInput.charAt(counter) == 'i' || wordInput.charAt(counter) == 'o' || wordInput.charAt(counter) == 'u'){
vowelCount ++;}
}
System.out.println("Vowels here are " + vowelCount + " in number");
}
} 