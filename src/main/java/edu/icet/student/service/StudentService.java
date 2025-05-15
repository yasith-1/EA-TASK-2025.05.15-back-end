package edu.icet.student.service;

import edu.icet.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {
    ArrayList<Student> studentList=new ArrayList<>();
    public void makeStudentList(Student student){
        studentList.add(student);
    }
    public ArrayList<Student> getStudentList(){
        return studentList;
    }
}
