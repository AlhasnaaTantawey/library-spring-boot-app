package com.dailycodework.ilibrary.service.imp;


import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.dto.BookDto;
import com.dailycodework.ilibrary.dto.UserDto;
import com.dailycodework.ilibrary.exception.BookNotFoundException;
import com.dailycodework.ilibrary.exception.UserAlreadyExistsException;
import com.dailycodework.ilibrary.exception.UserNotFoundException;
import com.dailycodework.ilibrary.mapper.UserMapper;
import com.dailycodework.ilibrary.repository.UserRepository;
import com.dailycodework.ilibrary.service.IUserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    @Override
    public UserDto add(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException("A user with " + user.getEmail() + " already exists");
        }
         else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return userMapper.map(userRepository.save(user));
        }
    }

    @Override
    public List<UserDto> getAllUsers() {
     List<User>  userList  =userRepository.findAll();
       return   userMapper.maptoList(userList);
    }

    @Override
    @Transactional
    public void delete(String email) {
        userRepository.deleteByEmail(email);
    }


    @Override
    public UserDto getUser(String email) {
        return userRepository.findByEmail(email)
                .map(userMapper::map)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }



    @Override
    public UserDto update(User user) {
       UserDto userDto = getUser(user.getEmail());
        if (userDto != null) {
            User user1 = userRepository.save(user);
            return userMapper.map(user1);
        } else {
            throw new BookNotFoundException("No book found with the id : " + user.getId());

        }

    }
}
