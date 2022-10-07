package com.crud.generator.crudgenerator.mapper;

import com.crud.generator.crudgenerator.dto.AnswerDTO;
import com.crud.generator.crudgenerator.model.Answer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AnswerMapper extends GenericMapper<Answer, AnswerDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    Answer asEntity(AnswerDTO dto);
}