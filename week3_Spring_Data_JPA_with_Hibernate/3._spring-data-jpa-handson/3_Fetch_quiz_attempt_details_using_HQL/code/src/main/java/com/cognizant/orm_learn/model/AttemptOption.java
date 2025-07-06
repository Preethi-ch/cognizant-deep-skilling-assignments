package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
@IdClass(AttemptOptionId.class)
public class AttemptOption {

    @Id
    @ManyToOne
    @JoinColumn(name = "attempt_id")
    private Attempt attempt;

    @Id
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @Id
    @ManyToOne
    @JoinColumn(name = "selected_option_id")
    private Option selectedOption;

    
    public Attempt getAttempt() {
        return attempt;
    }

    public Question getQuestion() {
        return question;
    }

    public Option getSelectedOption() {
        return selectedOption;
    }

   
    public void setAttempt(Attempt attempt) {
        this.attempt = attempt;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setSelectedOption(Option selectedOption) {
        this.selectedOption = selectedOption;
    }
}
