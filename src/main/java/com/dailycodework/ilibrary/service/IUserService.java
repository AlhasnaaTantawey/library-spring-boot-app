package com.dailycodework.ilibrary.service;

import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.dto.UserDto;

import java.util.List;

public interface IUserService {
    UserDto add(User user);
    List<UserDto> getAllUsers();
    void delete(String email);
   UserDto getUser(String email);
    UserDto update(User user);
}
