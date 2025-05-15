package edu.icet.student.controller;

import edu.icet.student.model.Student;
import edu.icet.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/set-data")
    public void setStudentData(@RequestBody Student student) {
        System.out.println(student);
        service.makeStudentList(student);
    }

    @GetMapping("get-data")
    public ArrayList<Student> getStudentData() {
        return service.getStudentList();
    }
}
