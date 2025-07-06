package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    private int id;

    private String text;

    private double score;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY)
    private List<Option> options;

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public double getScore() {
        return score;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
