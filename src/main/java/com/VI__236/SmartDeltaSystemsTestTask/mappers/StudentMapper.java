package com.VI__236.SmartDeltaSystemsTestTask.mappers;

import com.VI__236.SmartDeltaSystemsTestTask.dto.StudentDto;
import com.VI__236.SmartDeltaSystemsTestTask.models.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentMapper {

    public StudentDto studentModelToDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getName(),
                student.getFamilyName(),
                student.getPatronymic(),
                student.getGroupNumb(),
                student.getGrade()
        );
    }

    public Student studentDtoToModel(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getFamilyName(),
                studentDto.getPatronymic(),
                studentDto.getGroupNumb(),
                studentDto.getGrade());
    }

    public List<Student> studentsDtoListToModelList(List<StudentDto> studentsDto){
        return studentsDto.stream().map(this::studentDtoToModel).toList();
    }

    public List<StudentDto> studentsListModelToDtoList(List<Student> studentsModel){
        return studentsModel.stream().map(this::studentModelToDto).toList();
    }
}
