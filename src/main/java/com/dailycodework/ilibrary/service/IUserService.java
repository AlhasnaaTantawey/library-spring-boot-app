package com.dailycodework.ilibrary.service;

import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.UserRecord;

import java.util.List;

public interface IUserService {
    User add(User user);
    List<UserRecord> getAllUsers();
    void delete(String email);
   User getUser(String email);
    User update(User user);
}
