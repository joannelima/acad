package com.livres.acad.infra.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.livres.acad.infra.persistence.EvaluationEntity;

@Repository
public interface EvalutionRepository extends CrudRepository<EvaluationEntity, Integer> {
}
