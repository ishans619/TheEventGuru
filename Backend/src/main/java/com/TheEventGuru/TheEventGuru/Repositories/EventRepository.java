package com.TheEventGuru.TheEventGuru.Repositories;

import com.TheEventGuru.TheEventGuru.Entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByCategory(String category);
}
