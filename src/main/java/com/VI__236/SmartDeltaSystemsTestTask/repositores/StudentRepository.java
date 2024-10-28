package com.VI__236.SmartDeltaSystemsTestTask.repositores;

import com.VI__236.SmartDeltaSystemsTestTask.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student, long> {
}
