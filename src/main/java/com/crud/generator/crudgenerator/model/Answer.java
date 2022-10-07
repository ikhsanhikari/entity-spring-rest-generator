package com.crud.generator.crudgenerator.model;

import javax.persistence.*;

@Entity
@Table
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer(Long id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public Answer() {
    }
}
