package com.rocketseat.certification_nlw.modules.students.controllers.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {

    private UUID id;
    private UUID studentID;
    private String technology;
    private int grate;
    List<AnswerCertificationsEntity> answerCertificationsEntity;
}