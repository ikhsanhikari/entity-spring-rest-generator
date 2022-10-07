package com.crud.generator.crudgenerator.mapper;

import com.crud.generator.crudgenerator.dto.UserDTO;
import com.crud.generator.crudgenerator.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<User, UserDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    User asEntity(UserDTO dto);
}