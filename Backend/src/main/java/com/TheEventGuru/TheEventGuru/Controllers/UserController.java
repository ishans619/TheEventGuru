package com.TheEventGuru.TheEventGuru.Controllers;

import com.TheEventGuru.TheEventGuru.Entities.User;
import com.TheEventGuru.TheEventGuru.Entities.UserPreferences;
import com.TheEventGuru.TheEventGuru.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/{userId}/preferences")
    public UserPreferences addUserPreferences(@PathVariable Long userId, @RequestBody UserPreferences preference){
        preference.setUser(new User(userId));
        return userService.saveUserPreference(preference);
    }
}
