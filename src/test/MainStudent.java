package test;

import Entities.Student;
import expectionstudent.DuplicateStudentCodeExpetion;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentCode("abc-123");
        student1.setName("Jireh");
        student1.setLastName("Valenzuela");
        student1.setAge(19);

        Student student2 = new Student();
        student2.setStudentCode("def-456");
        student2.setName("Mia");
        student2.setLastName("Chachipanta");
        student2.setAge(22);

        Student student3 = new Student();
        student3.setStudentCode("def-456");
        student3.setName("Rosa");
        student3.setLastName("Lozano");
        student3.setAge(25);

        Student student4 = new Student();
        student4.setStudentCode("ghi-789");
        student4.setName("Pedro");
        student4.setLastName("Valdivia");
        student4.setAge(18);


        List<Student> studentList = new ArrayList<>();

            addStudent(student1, studentList);
            addStudent(student2, studentList);
            addStudent(student3, studentList);
            addStudent(student4, studentList);

        for(Student students: studentList){
            System.out.println(students);
        }
    }


    public static void addStudent(Student st, List<Student> studentList) {
        try{
        for(Student stu : studentList){
            if(stu.getStudentCode().equalsIgnoreCase(st.getStudentCode())){
                throw new DuplicateStudentCodeExpetion("Student's StudentCode: "
                        + st.getStudentCode() +" , already exists." + studentList);
            }
        }
        studentList.add(st);
    }catch (DuplicateStudentCodeExpetion ds){
            System.out.println(ds.getMessage());
        }
    }

}
