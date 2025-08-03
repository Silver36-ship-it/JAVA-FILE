
import java.util.Arrays;
public class FunctionArray {
public static int numberOfOccurence(int[] numbers, int number) {
	int totalLength =  numbers.length;
		int count = 0;
	for(int i = 0; i < totalLength; i++){
		if (numbers[i] == number){
			count++;
			}
		}
	return count;
	}
			
public static void main(String[] args){
int[] arrays = {1,3,4,8,3};
int number = 3;
int check = numberOfOccurence(arrays,number);
System.out.println(check);
}
}

//int [] score = new int[totalLength];