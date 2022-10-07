package com.crud.generator.crudgenerator.service.impl;

import com.crud.generator.crudgenerator.dao.AnswerRepository;
import com.crud.generator.crudgenerator.dto.AnswerDTO;
import com.crud.generator.crudgenerator.mapper.AnswerMapper;
import com.crud.generator.crudgenerator.model.Answer;
import com.crud.generator.crudgenerator.service.AnswerService;
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
public class AnswerServiceImpl implements AnswerService {
    private final AnswerRepository repository;

    public AnswerServiceImpl(AnswerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Answer save(Answer entity) {
        return repository.save(entity);
    }

    @Override
    public List<Answer> save(List<Answer> entities) {
        return (List<Answer>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Answer> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Answer> findAll() {
        return (List<Answer>) repository.findAll();
    }

    @Override
    public Page<Answer> findAll(Pageable pageable) {
        Page<Answer> entityPage = repository.findAll(pageable);
        List<Answer> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public Answer update(Answer entity, Long id) {
        Optional<Answer> optional = findById(id) ;
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}