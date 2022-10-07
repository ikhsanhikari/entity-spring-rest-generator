package com.crud.generator.crudgenerator.controller;

import com.crud.generator.crudgenerator.dto.LessonDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Lesson API")
public interface LessonController {
    @ApiOperation("Add new data")
    public LessonDTO save(@RequestBody LessonDTO lesson);

    @ApiOperation("Find by Id")
    public LessonDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<LessonDTO> list();

    @ApiOperation("Pagination request")
    public Page<LessonDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public LessonDTO update(@RequestBody LessonDTO dto, @PathVariable("id") Long id);
}