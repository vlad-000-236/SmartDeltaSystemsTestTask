package com.VI__236.SmartDeltaSystemsTestTask.repositores;

import com.VI__236.SmartDeltaSystemsTestTask.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository <Student, String> {
}
