package com.VI__236.SmartDeltaSystemsTestTask.controllers;

import com.VI__236.SmartDeltaSystemsTestTask.dto.StudentDto;
import com.VI__236.SmartDeltaSystemsTestTask.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthTableUI;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentDto studentDto;

    @Autowired
    public StudentController(StudentDto studentDto){
        this.studentDto = studentDto;
    }

    @GetMapping("/all")
    public List<StudentDto> getSudentsList(){
        return null;
    }

    @PostMapping("/update/{studentId}")
    public StudentDto updateStudent(@RequestParam Long studentId, @RequestBody StudentDto studentDto){
        return null;
    }

    @PutMapping("/newStudent")
    public StudentDto createNewStudent(@RequestBody StudentDto studentDto){
        return null;
    }

    @DeleteMapping("/delete/{studentId}")
    public void deleteStudent(@RequestParam Long studentId){
    }

}
