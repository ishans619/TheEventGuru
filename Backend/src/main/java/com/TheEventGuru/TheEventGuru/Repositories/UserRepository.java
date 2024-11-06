package com.TheEventGuru.TheEventGuru.Repositories;

import com.TheEventGuru.TheEventGuru.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
