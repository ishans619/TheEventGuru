package com.TheEventGuru.TheEventGuru.Controllers;

import com.TheEventGuru.TheEventGuru.Entities.Event;
import com.TheEventGuru.TheEventGuru.Services.ChatGPTService;
import com.TheEventGuru.TheEventGuru.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private ChatGPTService chatGPTService;

    @GetMapping
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("/recommendations")
    public String getEventRecommendations(@RequestParam String preferences) {
        return chatGPTService.getRecommendations(preferences);
    }

}
