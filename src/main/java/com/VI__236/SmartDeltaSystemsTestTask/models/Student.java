package com.VI__236.SmartDeltaSystemsTestTask.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Document (collection = "students")
@Component
public class Student {

    private long id;

    private String name;

    private String familyName;

    private String patronymic;

    private String groupNumb;

    private double grade;
}
