package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AttemptRepository extends JpaRepository<Attempt, Integer> {

    @Query("""
        SELECT a FROM Attempt a
        JOIN FETCH a.user
        JOIN FETCH a.questions q
        JOIN FETCH q.options
        LEFT JOIN FETCH a.selectedOptions so
        WHERE a.user.id = :userId AND a.id = :attemptId
    """)
    Attempt getAttempt(@Param("userId") int userId, @Param("attemptId") int attemptId);
}
