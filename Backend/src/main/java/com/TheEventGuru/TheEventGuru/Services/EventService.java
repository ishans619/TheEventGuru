package com.TheEventGuru.TheEventGuru.Services;

import com.TheEventGuru.TheEventGuru.Entities.Event;
import com.TheEventGuru.TheEventGuru.Repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public List<Event> getEventsByCategory(String category){
        return eventRepository.findByCategory(category);
    }
}
