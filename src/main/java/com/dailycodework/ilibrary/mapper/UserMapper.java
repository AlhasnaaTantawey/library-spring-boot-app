package com.dailycodework.ilibrary.mapper;

import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.dto.BookDto;
import com.dailycodework.ilibrary.dto.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto map(User entity);

    User unmap(UserDto dto);

    List<UserDto> maptoList(List<User> entityList);

    List<User> unmaptoList(List<UserDto> dtoList);
}
