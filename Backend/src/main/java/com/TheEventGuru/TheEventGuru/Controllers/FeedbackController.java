package com.TheEventGuru.TheEventGuru.Controllers;

import com.TheEventGuru.TheEventGuru.Entities.Feedback;
import com.TheEventGuru.TheEventGuru.Services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public Feedback addFeedback(@RequestBody Feedback feedback){
        return feedbackService.saveFeedback(feedback);
    }
}
