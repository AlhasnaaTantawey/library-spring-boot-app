package com.dailycodework.ilibrary.dto;

import com.dailycodework.ilibrary.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends BaseDto<Long> {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
}
