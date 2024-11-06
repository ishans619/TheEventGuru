package com.TheEventGuru.TheEventGuru.Repositories;

import com.TheEventGuru.TheEventGuru.Entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findUserById(Long userID);
}
