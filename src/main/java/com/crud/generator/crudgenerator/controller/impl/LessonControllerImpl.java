package com.crud.generator.crudgenerator.controller.impl;

import com.crud.generator.crudgenerator.controller.LessonController;
import com.crud.generator.crudgenerator.dto.LessonDTO;
import com.crud.generator.crudgenerator.mapper.LessonMapper;
import com.crud.generator.crudgenerator.model.Lesson;
import com.crud.generator.crudgenerator.service.LessonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/lesson")
@RestController
public class LessonControllerImpl implements LessonController {
    private final LessonService lessonService;
    private final LessonMapper lessonMapper;

    public LessonControllerImpl(LessonService lessonService, LessonMapper lessonMapper) {
        this.lessonService = lessonService;
        this.lessonMapper = lessonMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LessonDTO save(@RequestBody LessonDTO lessonDTO) {
        Lesson lesson = lessonMapper.asEntity(lessonDTO);
        return lessonMapper.asDTO(lessonService.save(lesson));
    }

    @Override
    @GetMapping("/{id}")
    public LessonDTO findById(@PathVariable("id") Long id) {
        Lesson lesson = lessonService.findById(id).orElse(null);
        return lessonMapper.asDTO(lesson);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        lessonService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<LessonDTO> list() {
        return lessonMapper.asDTOList(lessonService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<LessonDTO> pageQuery(Pageable pageable) {
        Page<Lesson> lessonPage = lessonService.findAll(pageable);
        List<LessonDTO> dtoList = lessonPage
                .stream()
                .map(lessonMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, lessonPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public LessonDTO update(@RequestBody LessonDTO lessonDTO, @PathVariable("id") Long id) {
        Lesson lesson = lessonMapper.asEntity(lessonDTO);
        return lessonMapper.asDTO(lessonService.update(lesson, id));
    }
}