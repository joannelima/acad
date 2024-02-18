package com.livres.acad.infra.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class EvaluationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Float height;

    private Float weight;

    private Date evaluationDay;

    @ManyToOne
    @JoinColumn(name="fk_evaluator")
    private PersonEntity evaluator;

    @ManyToOne
    @JoinColumn(name="fk_student")
    private PersonEntity student;

    

}
