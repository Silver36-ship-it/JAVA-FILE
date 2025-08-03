import java.util.Arrays;
public class ArrayKata {
public static int maximumInArray(int[] numbers) {
	int maximum = numbers[0];
for(int index =  0; index < numbers.length; index++) {
if(maximum < numbers[index]) {
	maximum = numbers[index];}
	}
return maximum;
}

public static int minimumInArray(int[] numbers) {
	int minimum = numbers[0];
for(int index = 0; index < numbers.length; index++) {
if(minimum > numbers[index]) {
	minimum = numbers[index];}
	}
	return minimum;
	}

public static int sumOfArray(int[] numbers) {
	int sum = 0;
for(int index = 0; index < numbers.length; index++) {
	sum += numbers[index];
	}
	return sum;
	}
	
public static int sumOfEvenArray(int[] numbers) {
	int even = 0;
for(int index = 0; index < numbers.length; index++) {
if(numbers[index] % 2 == 0) {
	even += numbers[index];
	}
	}
	return even;
	}

public static int sumOfOddArray(int[] numbers) {
	int odd = 0;
for(int index = 0; index < numbers.length; index++) {
if(numbers[index] % 2 != 0) {
	odd += numbers[index];
	}
	}
	return odd;
	}


public static int[] maximumAndMinimum(int[] numbers) {
	int maximum = numbers[0];
	int minimum = numbers[0];
for(int index = 0; index < numbers.length; index++) {
if(maximum < numbers[index]) {
	maximum = numbers[index];}
if(minimum > numbers[index]) {
	minimum = numbers[index];}
	}
	return new int[] {maximum,minimum};
}

public static int noOfOddNumbersInArray(int[] numbers) {
	int odd = 0;
for(int index = 0; index < numbers.length; index++) {
if(numbers[index] % 2 != 0) {
	odd++;
	}
	}
	return odd;
	}

public static int noOfEvenNumbersInArray(int[] numbers) {
	int even = 0;
for(int index = 0; index < numbers.length; index++) {
if(numbers[index] % 2 == 0){
	even++;}
	}
return even;
}


public static int[] evenNumbersInArray(int[] numbers) {
	int countEven = 0;
for(int index = 0; index < numbers.length; index++) {
if(numbers[index] % 2 == 0) {
	countEven++;}
}
	int[] even = new int [countEven];
  int newCount = 0;
 for(int index = 0; index < numbers.length; index++) {
 	if(numbers[index] % 2 == 0) {
 	even[newCount] = numbers[index];
 	newCount++;}
 	}
 	return even;
 	}


public static int[] oddNumbersInArray(int[] numbers) {
	int countOdd = 0;
for(int index = 0; index < numbers.length; index++) {
if(numbers[index] % 2 != 0) {
	countOdd++;}
}
	int[] odd = new int[countOdd];
  int newCount = 0;
 for(int index = 0; index < numbers.length; index++) {
 if(numbers[index] % 2 != 0) {
 	odd[newCount] = numbers[index];
 	newCount++;}
 	}
 return odd;
 }


public static int[] squareNumbersInArray(int[] numbers) {
int count = 0;
for(int index = 0; index < numbers.length; index++) {
   count++;}
   
   int[] square = new int[count];
   	int countSquare = 0;
   for(int index = 0; index < numbers.length; index++) {
    square[countSquare] = numbers[index] * numbers[index];
     countSquare++;}
    return square;
    } 


public static void main(String[] args) {
int[] score = {2,3,4,5,5};
int[] array = maximumAndMinimum(score);
System.out.println("Maximum number is " + array[0]);
System.out.println("Minimum number is " + array[1]);

//int array = noOfEvenNumbersInArray(score);
//System.out.println("Number of even numbers are " + array);

//int[] array = evenNumbersInArray(score);
int[] array1 = oddNumbersInArray(score);
int[] array2 = squareNumbersInArray(score);
//System.out.println("Even numbers are " + Arrays.toString(array));

System.out.println("Odd numbers are " + Arrays.toString(array1));

System.out.println("Sqaure numbers are " + Arrays.toString(array2));
}
}