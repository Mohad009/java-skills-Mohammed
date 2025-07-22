import java.util.Arrays;

public class GradeManager {
    
    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) { 
        String []revNames=new String[names.length];
           for (int i = 0; i < names.length; i++) {
        String original = names[i];
        String reversed = "";
        for (int j = original.length() - 1; j >= 0; j--) {
            reversed += original.charAt(j);
        }
        revNames[i] = reversed;
            
        }
        return revNames;
 
}


// Method to calculate letter grades 
public static char getLetterGrade(int score) { 

 char grade='-';
    if(score <=100 && score >=90)grade='A';
    else if(score <=89 && score >=80) grade='B';
    else if(score <=79 && score >=70) grade='C';
    else if(score <=69 && score >=60) grade='D';
    else if(score < 60) grade='F';

 return grade;
} 



// Method to find students who need to retake exam 
public static String[] findFailingStudents(String[] names, int[] scores) 
{ 
    String []retakers=new String[names.length];
    for(int i=0;i<names.length;i++){
        if(scores[i]<60){
            retakers[i]=names[i];
        }
    }
    return retakers;
} 

public static void main(String[] args) { 
String[] students = {"Alice", "Bob", "Charlie", "Diana"}; 
int[] scores = {95, 67, 45, 78}; 

String []reversedNames=GradeManager.reverseStudentNames(students);
String []reset=GradeManager.findFailingStudents(students,scores);
System.out.println("Names in reverse order: "+Arrays.toString(reversedNames));
System.out.println("Grade for Alice :"+GradeManager.getLetterGrade(scores[0]));

System.out.println("Failded Students: "+Arrays.toString(reset));
// Test all your methods 
// Display results clearly 
} 

}
