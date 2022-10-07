package com.crud.generator.crudgenerator.controller;

import com.crud.generator.crudgenerator.dto.AnswerDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Answer API")
public interface AnswerController {
    @ApiOperation("Add new data")
    public AnswerDTO save(@RequestBody AnswerDTO answer);

    @ApiOperation("Find by Id")
    public AnswerDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<AnswerDTO> list();

    @ApiOperation("Pagination request")
    public Page<AnswerDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public AnswerDTO update(@RequestBody AnswerDTO dto, @PathVariable("id") Long id);
}