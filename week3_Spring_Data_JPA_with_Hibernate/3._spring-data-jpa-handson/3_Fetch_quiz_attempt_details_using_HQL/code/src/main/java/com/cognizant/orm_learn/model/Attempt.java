package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Attempt {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime attemptedAt;

    @ManyToMany
    @JoinTable(
        name = "attempt_question",
        joinColumns = @JoinColumn(name = "attempt_id"),
        inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private Set<Question> questions;

    @OneToMany(mappedBy = "attempt")
    private Set<AttemptOption> selectedOptions;

   

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getAttemptedAt() {
        return attemptedAt;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public Set<AttemptOption> getSelectedOptions() {
        return selectedOptions;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAttemptedAt(LocalDateTime attemptedAt) {
        this.attemptedAt = attemptedAt;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public void setSelectedOptions(Set<AttemptOption> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }
}
