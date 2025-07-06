package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.*;
import com.cognizant.orm_learn.service.AttemptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private AttemptService attemptService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {
        testGetAttemptDetails();
    }

    public void testGetAttemptDetails() {
        Attempt attempt = attemptService.getAttempt(1, 1);
        System.out.println("User: " + attempt.getUser().getUsername());
        System.out.println("Attempted At: " + attempt.getAttemptedAt());

        for (Question q : attempt.getQuestions()) {
            System.out.println("\n" + q.getText());
            for (Option opt : q.getOptions()) {
                boolean selected = attempt.getSelectedOptions().stream()
                    .anyMatch(ao -> ao.getSelectedOption().getId() == opt.getId());

                System.out.printf(" %d) %s\t%.1f\t%s\n",
                    opt.getId(), opt.getText(), q.getScore(), selected);
            }
        }
    }
}
