import java.util.Scanner;
public class TwelveDays{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
String name = """
          The 
      Twelve Days 
           Of 
     Christmas Song
     
    
     """;
     System.out.print(name);
     System.out.println("Do you wish to see the songs? press 0");
     int number = input.nextInt();
     if(number == 0){
     System.out.println("""
     1-> First
     2-> Second
     3-> Third
     4-> Fourth
     5-> Fifth
     6-> Sixth
     7-> Seventh
     8-> Eighth
     9-> Ninth
     10-> Tenth
     11-> Eleventh
     12-> Twelveth
     """) ;}
     else {
      System.out.println("Invalid input");
     }
    
     System.out.println("Choose an option:");
     int mainPage = input.nextInt();
     switch(mainPage){
case 1 : System.out.println("""
         On the first day of Christmas
         My true love gave to me
         A partridge in a pear tree.
         
         Press 0 to go back
         """);
         
         do{
         int mainFirst = input.nextInt();
         if(number == 0){
     System.out.println("""
     1-> First
     2-> Second
     3-> Third
     4-> Fourth
     5-> Fifth
     6-> Sixth
     7-> Seventh
     8-> Eighth
     9-> Ninth
     10-> Tenth
     11-> Eleventh
     12-> Twelveth
     """) ;}
     else {
      System.out.println("Invalid input");
     }
     } while(number == 0);
          break;
 case 2 : System.out.println("""
            On the second day of Christmas
            My true love gave to me
            Two turtle doves
            And a partridge in a pear tree.
            """); break;
         }
     }
     }