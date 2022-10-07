package com.crud.generator.crudgenerator.dao;

import com.crud.generator.crudgenerator.model.Lesson;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends PagingAndSortingRepository<Lesson, Long> {
}