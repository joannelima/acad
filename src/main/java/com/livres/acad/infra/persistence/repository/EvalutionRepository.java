package com.livres.acad.infra.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.livres.acad.infra.persistence.entity.EvaluationEntity;

@Repository
public interface EvalutionRepository extends CrudRepository<EvaluationEntity, Integer> {
}
