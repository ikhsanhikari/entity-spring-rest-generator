package com.crud.generator.crudgenerator.dao;

import com.crud.generator.crudgenerator.model.Answer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long> {
}