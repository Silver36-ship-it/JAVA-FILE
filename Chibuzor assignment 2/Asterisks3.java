public class Asterisks3{
public static void main(String[] args){
for(int i = 0; i < 11; i++){
for(int j = 0; j <= i; j++){
System.out.print(" ");
}
for(int f = 10; f > i; f--){
System.out.print("*");
}
System.out.println();
}
}
}