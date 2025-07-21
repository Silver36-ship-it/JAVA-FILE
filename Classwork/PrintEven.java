public class PrintEven {
public static void main(String[] args) {
int result = 1;
for(int i = 1; i < 11; i++) {

if(i % 2 == 0){
result = result * i;
}

}
System.out.println(result);


}
}