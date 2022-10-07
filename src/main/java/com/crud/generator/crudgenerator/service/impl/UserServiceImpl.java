package com.crud.generator.crudgenerator.service.impl;

import com.crud.generator.crudgenerator.dao.UserRepository;
import com.crud.generator.crudgenerator.dto.UserDTO;
import com.crud.generator.crudgenerator.mapper.UserMapper;
import com.crud.generator.crudgenerator.model.User;
import com.crud.generator.crudgenerator.service.UserService;
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
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User entity) {
        return repository.save(entity);
    }

    @Override
    public List<User> save(List<User> entities) {
        return (List<User>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        Page<User> entityPage = repository.findAll(pageable);
        List<User> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public User update(User entity, Long id) {
        Optional<User> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}