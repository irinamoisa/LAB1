package tas2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Course {

   private String title;
   private String description;
   private Student[] students;

   public String getTitle(){
       return title;
   }

   public void setTitle(String title){
       this.title = title;
   }

   public String getDescription(){
       return description;
   }

   public void setDescription(String description){
       this.description = description;
   }

   public Student[] getStudents(){
       return students;
   }

   public void setStudents(Student[] students){
       this.students = students;
   }

   @Override
   public String toString(){
       return "Course{" +
               "title=" + title + '\'' +
               ", description=" + description + '\'' +
               ", students=" + Arrays.toString(students) +
               '}';

   }

   public Student[] filterYear(int year){
       Student[] yearStudents = new Student[students.length];
       int i, j = 0;
       for(i = 0; i < students.length; i++){
           if(students[i].getYear() == year){
               yearStudents[j] = students[i];
               j++;
           }
       }
       return yearStudents;
   }

}
