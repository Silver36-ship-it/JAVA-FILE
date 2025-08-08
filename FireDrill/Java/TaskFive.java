public class TaskFive {
public static void main(String[] args){
String line = "";
for(int index = 1; index <= 10; index++){
if(index % 4 == 0){
	for(int count = 1; count < 6; count++){  
line += index;
}
line += ' ';
}
}
System.out.print (line);
}
}


