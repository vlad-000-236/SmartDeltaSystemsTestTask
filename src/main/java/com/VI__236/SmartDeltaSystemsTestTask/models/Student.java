package com.VI__236.SmartDeltaSystemsTestTask.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


@Document (collection = "students")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Setter
    @Getter
    @Id
    private String id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private String familyName;

    @Setter
    @Getter
    private String patronymic;

    @Setter
    @Getter
    private String groupNumb;

    @Setter
    @Getter
    private double grade;

    @Override
    public String toString() {
        return String.format(
                "Student[id=%s, name='%s', familyName='%s', patronymic='%s', groupNumb='%s', grade='%s']",
                id, name, familyName, patronymic, groupNumb, grade);
    }
}
