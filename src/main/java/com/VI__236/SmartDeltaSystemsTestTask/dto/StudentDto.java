package com.VI__236.SmartDeltaSystemsTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private long id;

    private String name;

    private String familyName;

    private String patronymic;

    private String groupNumb;

    private double grade;
}
