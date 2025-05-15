package edu.icet.student.controller;

import edu.icet.student.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @PostMapping("/get-data")
    public void getStudentData(@RequestBody Student student){
        System.out.println(student);
    }
}
