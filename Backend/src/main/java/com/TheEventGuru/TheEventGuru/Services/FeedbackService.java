package com.TheEventGuru.TheEventGuru.Services;

import com.TheEventGuru.TheEventGuru.Entities.Feedback;
import com.TheEventGuru.TheEventGuru.Repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback){
        return feedbackRepository.save(feedback);
    }
}
