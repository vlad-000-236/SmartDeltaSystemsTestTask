package com.VI__236.SmartDeltaSystemsTestTask.services;

import com.VI__236.SmartDeltaSystemsTestTask.errorsheandlers.NotFoundException;
import com.VI__236.SmartDeltaSystemsTestTask.models.Student;
import com.VI__236.SmartDeltaSystemsTestTask.repositores.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImplementation implements StudentService{

    private Student student;
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplementation(Student student, StudentRepository studentRepository){
        this.student = student;
        this.studentRepository = studentRepository;
    }

    private Student getStudentById(long id){
        return studentRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentsList;
        studentsList = studentRepository.findAll();
        return studentsList;
    }

    /*

    public List<Ad> getAllAds(Specification<Ad> spec) {
        var ids = adRepo.findIds(spec);
        if (ids.isEmpty()) {
            return List.of();
        }

        return adRepo.findAllByIds(ids, Sort.unsorted());
    }

     */

    @Override
    public Student changeStudent(Student student) {
        Student newVersionStudent = getStudentById(student.getId());

        newVersionStudent.setId(student.getId());
        newVersionStudent.setName(student.getName());
        newVersionStudent.setPatronymic(student.getPatronymic());
        newVersionStudent.setFamilyName(student.getFamilyName());
        newVersionStudent.setGroupNumb(student.getGroupNumb());
        newVersionStudent.setGrade(student.getGrade());

        studentRepository.save(newVersionStudent);

        return newVersionStudent;
    }

    @Override
    public Student createStudent(Student student) {
        Student newStudent = new Student (student.getId(),
                                          student.getName(),
                                          student.getFamilyName(),
                                          student.getPatronymic(),
                                          student.getGroupNumb(),
                                          student.getGrade());

        studentRepository.save(newStudent);

        return newStudent;
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
