package com.crud.generator.crudgenerator.mapper;

import com.crud.generator.crudgenerator.dto.LessonDTO;
import com.crud.generator.crudgenerator.model.Lesson;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LessonMapper extends GenericMapper<Lesson, LessonDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    Lesson asEntity(LessonDTO dto);
}