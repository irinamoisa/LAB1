package tas2;

import java.util.Arrays;

public class Test {

    public static void main(String[] arg){

        Course math = new Course();
        math.setTitle("MATH");
        math.setDescription("supersuper");

        Student[] students = new Student[3];

        Student student1 = new Student();
        student1.setName("Iri");
        student1.setYear(1);
        students[0] = student1;

        Student student2 = new Student();
        student2.setName("Mihai");
        student2.setYear(4);
        students[1] = student2;

        Student student3 = new Student();
        student3.setName("Mihai");
        student3.setYear(4);
        students[2] = student3;

        math.setStudents(students);

        Student[] array = math.filterYear(Integer.parseInt(arg[0]));

        //System.out.println((Arrays.toString(students)) + '\n');
        //System.out.println(math);
        System.out.println((Arrays.toString(array)) + '\n');

        System.out.println("Equal?\n" + student2.equals(student3));
    }

}
