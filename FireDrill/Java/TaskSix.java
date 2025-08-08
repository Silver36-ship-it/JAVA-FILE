public class TaskSix {
public static void main(String[] args){
//String line = "";
for(int index = 1; index <= 10; index++){
int multiply = 1;
if(index % 4 == 0){
for(int count = 1; count < 6; count++){  
multiply *= index;
//line += " ";
System.out.print (multiply + " ");
//line += ' ';
}
}
}
}
}