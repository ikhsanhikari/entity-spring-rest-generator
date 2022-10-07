package com.crud.generator.crudgenerator.dao;

import com.crud.generator.crudgenerator.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}