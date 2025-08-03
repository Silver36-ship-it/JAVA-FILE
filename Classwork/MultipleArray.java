import java.util.Arrays;
public class MultipleArray {
public static void main (String[] args){
int [] [] values = {{50,10}, {7,9},{40,10}};
for(int row = 0; row < values.length; row++){
for(int column = 0; column < values[row].length;column++){
System.out.println(values[row][column]);}
System.out.println(Arrays.toString(values[row]));
}
}
}

public GradeBook(String courseName, int [] [] grades) {
 this.courseName = courseName;
 this.grades = grades;
 
public void setCourseName(String courseName) {
 this.courseName = courseName; 
 }
 
public String getCourseName() {
  return courseName;
 } 
public void processGrades() {
    outputGrades();
    
    System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(), 
    "Highest grade in the grade book is", getMaximum());
  outputBarChart();
   } 
 public int getMinimum() {
  int lowGrade = grades[0][0];   
  
for (int[] studentGrades : grades) {                                         
   for (int grade : studentGrades) {                       
      if (grade < lowGrade) {                              
         lowGrade = grade;                                 
      }                                                    
   }                                                       
}   
    return lowGrade; 
       } 
 public int getMaximum() {
 int highGrade = grades[0][0];
  for (int[] studentGrades : grades) {
          for (int grade : studentGrades) {
          if (grade > highGrade) {
            highGrade = grade;
         } 
         } 
    } 
   return highGrade; 
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
      