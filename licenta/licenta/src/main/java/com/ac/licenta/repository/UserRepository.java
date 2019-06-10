package com.ac.licenta.repository;

import com.ac.licenta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByRfid(String rfid);
}
