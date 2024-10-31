package com.VI__236.SmartDeltaSystemsTestTask.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

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
}
