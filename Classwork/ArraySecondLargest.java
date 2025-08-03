public class ArraySecondLargest{
public static void main(String[] args){

int number = 10;
int number1 = 2;
int number2 = 4;
int number3 = 15;
int number4 = 14;
int number5 = 21;

int[] score = {number, number1, number2, number3, number4, number5};
int largest = number;
int secondLargest = number;

for (int counter = 0; counter < score.length; counter++){
	if (score[counter] > largest){
		largest = score[counter];
		}
		}
for (int counter = 0; counter < score.length; counter++){
	if(largest == score[counter]){
		continue;}
	if(score[counter] > secondLargest){
		secondLargest = score[counter];
		}
		}
	System.out.println("Largest is " + largest);
	System.out.println("Second largest " + secondLargest);
	
	}
	}