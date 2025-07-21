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
     1-> On the first day of Christmas
     2-> On the second day of Christmas
     3-> On the third day of Christmas
     4-> On the fourth day of Christmas
     5-> On the fifth day of Christmas			
     6-> On the sixth day of Christmas
     7-> On the seventh day of Christmas
     8-> On the eighth day of Christmas
     9-> On the ninth day of Christmas
     10-> On the tenth day of Christmas
     11-> On the eleventh day of Christmas
     12-> On the twelfth day of Christmas
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
         
         press 2 to go to next verse
         
         """);
             
          mainPage = input.nextInt();
        switch(mainPage){
 case 2 : System.out.println("""
            On the second day of Christmas
            My true love gave to me
            Two turtle doves
            And a partridge in a pear tree.
            
            press 3 to go to next verse
            """);break;
            default : System.out.println("Invalid input"); } 
            
             mainPage = input.nextInt();
        switch(mainPage){
 case 3 : System.out.println("""
            On the third day of Christmas
	      My true love gave to me
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree
		
		  press 4 to go to next verse
		"""); }
		
		mainPage = input.nextInt();
        switch(mainPage){
case 4 : System.out.println("""
		On the fourth day of Christmas
		My true love gave to me
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		   press 5 to go to next verse
		"""); }
		
		mainPage = input.nextInt();
        switch(mainPage){
case 5 : System.out.println("""
		On the fifth day of Christmas
		My true love gave to me
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		  press 6 to go to next verse
		"""); }
		
		mainPage = input.nextInt();
        switch(mainPage){
case 6 : System.out.println("""
		On the sixth day of Christmas
		My true love gave to me
		Six geese a-laying,
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		  press 7 to go to next verse
		"""); }
		
		mainPage = input.nextInt();
        switch(mainPage){
case 7 : System.out.println("""
		On the seventh day of Christmas
		My true love gave to me
		Seven swans a-swimming,
		Six geese a-laying,
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		press 8 to go to next verse
		"""); }
		
		mainPage = input.nextInt();
        switch(mainPage){
case 8 : System.out.println("""
		On the eighth day of Christmas
		My true love gave to me
		Eight maids a-milking,
		Seven swans a-swimming,
		Six geese a-laying,
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		  press 9 to go to next verse
		"""); }
		
		mainPage = input.nextInt();
        switch(mainPage){
case 9 : System.out.println("""
		On the ninth day of Christmas
		My true love gave to me
		Nine ladies dancing,
		Eight maids a-milking,
		Seven swans a-swimming,
		Six geese a-laying,
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		  press 10 to go to next verse
		"""); }
		
		mainPage = input.nextInt();
        switch(mainPage){
case 10 : System.out.println("""
		On the tenth day of Christmas
		My true love gave to me
		Ten lords a-leaping,
		Nine ladies dancing,
		Eight maids a-milking,
		Seven swans a-swimming,
		Six geese a-laying,
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		   press 11 to go to next verse
		""");}
		
		mainPage = input.nextInt();
        switch(mainPage){
case 11 : System.out.println("""
		On the eleventh day of Christmas
		My true love gave to me
		Eleven pipers piping,
		Ten lords a-leaping,
		Nine ladies dancing,
		Eight maids a-milking,
		Seven swans a-swimming,
		Six geese a-laying,
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		
		   press 12 to go to next verse
		""");}
		
		mainPage = input.nextInt();
        switch(mainPage){ 
case 12 : System.out.println("""
		On the twelfth day of Christmas
		My true love gave to me
		Twelve drummers drumming,
		Eleven pipers piping,
		Ten lords a-leaping,
		Nine ladies dancing,
		Eight maids a-milking,
		Seven swans a-swimming,
		Six geese a-laying,
		Five golden rings,
		Four calling birds,
		Three French hens,
		Two turtle doves
		And a partridge in a pear tree.
		""");}
default : System.out.println("Invalid input");
         }
     }
     }