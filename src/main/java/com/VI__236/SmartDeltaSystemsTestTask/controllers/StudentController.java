package com.VI__236.SmartDeltaSystemsTestTask.controllers;

import com.VI__236.SmartDeltaSystemsTestTask.dto.StudentDto;
import com.VI__236.SmartDeltaSystemsTestTask.mappers.StudentMapper;
import com.VI__236.SmartDeltaSystemsTestTask.models.Student;
import com.VI__236.SmartDeltaSystemsTestTask.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthTableUI;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentDto studentDto;
    private StudentService studentService;
    private StudentMapper studentMapper;

    @Autowired
    public StudentController(StudentDto studentDto, StudentService studentService,
                             StudentMapper studentMapper){
        this.studentDto = studentDto;
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @GetMapping("/all")
    public List<StudentDto> getSudentsList(){
        return studentMapper.studentsListModelToDtoList(studentService.getAllStudents());
    }

    @PostMapping("/update/{studentId}")
    public StudentDto updateStudent(@RequestParam String studentId, @RequestBody StudentDto studentDto){
        return studentMapper.studentModelToDto(studentService.createStudent(studentMapper.studentDtoToModel(studentDto)));
    }

    @PutMapping("/newStudent")
    public StudentDto createNewStudent(@RequestBody StudentDto studentDto){
        return studentDto;
    }

    @DeleteMapping("/delete/{studentId}")
    public void deleteStudent(@RequestParam String studentId){
    }

}
