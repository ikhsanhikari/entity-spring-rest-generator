package com.crud.generator.crudgenerator.dto;

public class AnswerDTO extends AbstractDTO<Long> {
    private Long id;
    private String answer;

    public AnswerDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }
}