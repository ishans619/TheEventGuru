package com.TheEventGuru.TheEventGuru.Services;

import com.TheEventGuru.TheEventGuru.Entities.User;
import com.TheEventGuru.TheEventGuru.Entities.UserPreferences;
import com.TheEventGuru.TheEventGuru.Repositories.UserPreferencesRepository;
import com.TheEventGuru.TheEventGuru.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserPreferencesRepository preferencesRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<UserPreferences> getUserPreferences(Long userId){
        return preferencesRepository.findByUserId(userId);
    }

    public UserPreferences saveUserPreference(UserPreferences preference){
        return preferencesRepository.save(preference);
    }
}
