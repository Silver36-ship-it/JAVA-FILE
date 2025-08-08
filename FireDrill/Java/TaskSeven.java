public class TaskSeven {
public static void main(String[] args){
String line = "";
int sum = 0;
for(int index = 1; index <= 10; index++){
int multiply = 1;
if(index % 4 == 0){
for(int count = 1; count < 6; count++){  
multiply *= index;
//line += " ";
sum += multiply;
//line += index;

//line += ' ';
}
//line += ' ';
}
}
System.out.print (sum);
}
}




