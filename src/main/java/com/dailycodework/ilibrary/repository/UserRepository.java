package com.dailycodework.ilibrary.repository;

import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.base.BaseRepository;
import com.dailycodework.ilibrary.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    Optional<User> findByEmail(String email);
    void deleteByEmail(String email);
}
