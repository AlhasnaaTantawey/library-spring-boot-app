package com.dailycodework.ilibrary.controller;

import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.dto.UserDto;
import com.dailycodework.ilibrary.service.imp.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.FOUND);
    }
    @PostMapping("/add")
    public ResponseEntity<UserDto> add(@RequestBody User user){
        return ResponseEntity.ok(userService.add(user));
    }

    @GetMapping("/{email}")
    public UserDto getByEmail(@PathVariable("email") String email){
        return  userService.getUser(email);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
        userService.delete(email);
    }

    @PatchMapping("/update")
    public ResponseEntity<UserDto> update(@RequestBody User user){
        return ResponseEntity.ok(userService.update(user));
    }

}
