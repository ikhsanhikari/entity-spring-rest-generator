package com.crud.generator.crudgenerator.dto;

public class LessonDTO extends AbstractDTO<Integer> {
    private Integer id;
    private String lesson;

    public LessonDTO() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLesson() {
        return this.lesson;
    }
}