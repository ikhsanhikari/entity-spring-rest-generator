package com.crud.generator.crudgenerator.util;

import com.crud.generator.crudgenerator.dto.UserDTO;
import com.crud.generator.crudgenerator.model.User;

import java.util.Arrays;
import java.util.List;

public class UserBuilder {
    public static List<UserDTO> getListDTO() {
        return Arrays.asList(new UserDTO(1L,"ikhsan","cirebon"));
    }

    public static List<User> getListEntities() {
        return Arrays.asList(new User(1L,"ikhsan","cirebon"),new User(2L,"ikhsan","cirebon"));
    }

    public static UserDTO getDTO() {
        return new UserDTO(1L,"ikhsan","cirebon");
    }

    public static User getEntity() {
        return new User(1L,"ikhsan","cirebon");
    }
}
