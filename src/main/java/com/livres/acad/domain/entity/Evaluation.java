package com.livres.acad.domain.entity;

import java.util.Date;

public record Evaluation(Float height, Float weight, Date evaluationDay, Person evaluator, Person student){

}
