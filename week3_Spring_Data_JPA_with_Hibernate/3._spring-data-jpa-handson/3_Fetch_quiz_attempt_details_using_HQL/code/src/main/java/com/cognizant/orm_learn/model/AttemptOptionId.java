package com.cognizant.orm_learn.model;

import java.io.Serializable;
import java.util.Objects;

public class AttemptOptionId implements Serializable {
    private int attempt;
    private int question;
    private int selectedOption;

    public AttemptOptionId() {}

    public AttemptOptionId(int attempt, int question, int selectedOption) {
        this.attempt = attempt;
        this.question = question;
        this.selectedOption = selectedOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttemptOptionId)) return false;
        AttemptOptionId that = (AttemptOptionId) o;
        return attempt == that.attempt &&
               question == that.question &&
               selectedOption == that.selectedOption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(attempt, question, selectedOption);
    }
}
