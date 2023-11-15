import java.util.ArrayList;
import java.util.Collections;


public class Student {
    public static void main(String[ ] args) {
        ArrayList<String> studentNames = new ArrayList();
        addStudents(studentNames);
        displaystudents(studentNames);
        Collections.sort(studentNames);
        displaystudents(studentNames);
    }//end method main``
    
    static void addStudents(ArrayList<String> studentNames) {
        //Add the names of everyone in your class
        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Beth");
    }//end method addStudents

    public static void displaystudents(ArrayList<String> studentNames) {
        for(String student: studentNames)
            System.out.println("Student Name: " + student);
    }

    
}//end class Student