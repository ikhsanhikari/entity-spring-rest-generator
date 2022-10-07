package com.crud.generator.crudgenerator.controller.impl;

import com.crud.generator.crudgenerator.controller.AnswerController;
import com.crud.generator.crudgenerator.dto.AnswerDTO;
import com.crud.generator.crudgenerator.mapper.AnswerMapper;
import com.crud.generator.crudgenerator.model.Answer;
import com.crud.generator.crudgenerator.service.AnswerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/answer")
@RestController
public class AnswerControllerImpl implements AnswerController {
    private final AnswerService answerService;
    private final AnswerMapper answerMapper;

    public AnswerControllerImpl(AnswerService answerService, AnswerMapper answerMapper) {
        this.answerService = answerService;
        this.answerMapper = answerMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AnswerDTO save(@RequestBody AnswerDTO answerDTO) {
        Answer answer = answerMapper.asEntity(answerDTO);
        return answerMapper.asDTO(answerService.save(answer));
    }

    @Override
    @GetMapping("/{id}")
    public AnswerDTO findById(@PathVariable("id") Long id) {
        Answer answer = answerService.findById(id).orElse(null);
        return answerMapper.asDTO(answer);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        answerService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<AnswerDTO> list() {
        return answerMapper.asDTOList(answerService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<AnswerDTO> pageQuery(Pageable pageable) {
        Page<Answer> answerPage = answerService.findAll(pageable);
        List<AnswerDTO> dtoList = answerPage
                .stream()
                .map(answerMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, answerPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public AnswerDTO update(@RequestBody AnswerDTO answerDTO, @PathVariable("id") Long id) {
        Answer answer = answerMapper.asEntity(answerDTO);
        return answerMapper.asDTO(answerService.update(answer, id));
    }
}