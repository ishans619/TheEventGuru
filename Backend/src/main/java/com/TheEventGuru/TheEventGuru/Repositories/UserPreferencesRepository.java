package com.TheEventGuru.TheEventGuru.Repositories;

import com.TheEventGuru.TheEventGuru.Entities.UserPreferences;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserPreferencesRepository extends JpaRepository<UserPreferences, Long> {
    List<UserPreferences> findByUserId(Long userID);
}
