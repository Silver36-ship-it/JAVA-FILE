public class PatternC{
public static void main(String[] args){
for(int i = 1; i < 7; i++){
for(int s = 6; s > i; s--){
System.out.print(" ");
}
for(int j = i; j >= 1; j--){
System.out.print(j);
}
System.out.println();
}
}
}
