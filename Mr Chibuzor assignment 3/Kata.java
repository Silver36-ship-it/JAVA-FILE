public class Kata{

//A function to check for even numbers
public static boolean EvenNumber(int number){
return number % 2 == 0;
}

//A function to check for Absolute subtraction
public static int Substract(int number, int number1){
return Math.abs(number - number1);
}

//A function to check for factors
public static int FactorNumber(int number){
int checkCount = 0;
for(int i = 1; i <= number; i++){
if(number % i == 0){
  checkCount++;
  }
  }
  return checkCount;
  }
  
//A function to check for Square true
public static boolean CheckSquare(int number){
if(number < 0){
return false;
}
int squareCheck = (int) Math.sqrt(number);

return squareCheck * squareCheck == number;
}

//A function to check palindrome
public static boolean isPalindrome(int number){
int d1 = (number / 10000);
int d2 = (number / 1000) % 10;
int d3 = (number / 100) % 10;
int d4 = (number / 10) % 10;
int d5 = number % 10;
if (number < 10000 || number > 99999){
return false;
}
if (d1 == d5 && d2 == d4){
return true;}
else{
return false;
}
}

//A function to check factorial
public static long isFactorial(int number){
int result = 1;
for(int i = 1; i <= number; i++){
result *= i;
}
return result;
}

//A function to Square Of Number
public static long squareOf(int number){
return number * number;
}

//A function to divide number
public static float isDivide(int number, int number1){
if (number1 == 0){
System.out.println("Invalid input");
}
return number / number1;
}

//A function to prime number
public static boolean isPrime(int number){
if(number <= 1){
return false;}
if (number == 2){
return false;}
for (int i = 2; i <= Math.sqrt(number); i++){
if (number % i == 0){
return false;
}
}
return true;
}
}