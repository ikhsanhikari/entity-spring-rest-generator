package com.crud.generator.crudgenerator.service.impl;

import com.crud.generator.crudgenerator.dao.LessonRepository;
import com.crud.generator.crudgenerator.dto.LessonDTO;
import com.crud.generator.crudgenerator.mapper.LessonMapper;
import com.crud.generator.crudgenerator.model.Lesson;
import com.crud.generator.crudgenerator.service.LessonService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class LessonServiceImpl implements LessonService {
    private final LessonRepository repository;

    public LessonServiceImpl(LessonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Lesson save(Lesson entity) {
        return repository.save(entity);
    }

    @Override
    public List<Lesson> save(List<Lesson> entities) {
        return (List<Lesson>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Lesson> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Lesson> findAll() {
        return (List<Lesson>) repository.findAll();
    }

    @Override
    public Page<Lesson> findAll(Pageable pageable) {
        Page<Lesson> entityPage = repository.findAll(pageable);
        List<Lesson> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public Lesson update(Lesson entity, Long id) {
        Optional<Lesson> optional = findById(id) ;
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}