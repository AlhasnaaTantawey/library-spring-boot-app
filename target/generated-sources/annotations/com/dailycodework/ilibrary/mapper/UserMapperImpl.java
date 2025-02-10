package com.dailycodework.ilibrary.mapper;

import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-09T11:50:09+0200",
    comments = "version: 1.6.0.Beta2, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto map(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( entity.getId() );
        userDto.setStatusCode( entity.getStatusCode() );
        userDto.setCreatedBy( entity.getCreatedBy() );
        userDto.setCreatedData( entity.getCreatedData() );
        userDto.setLastModifiedBy( entity.getLastModifiedBy() );
        userDto.setLastModifiedData( entity.getLastModifiedData() );
        userDto.setFirstName( entity.getFirstName() );
        userDto.setLastName( entity.getLastName() );
        userDto.setEmail( entity.getEmail() );
        userDto.setPassword( entity.getPassword() );
        userDto.setRole( entity.getRole() );

        return userDto;
    }

    @Override
    public User unmap(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setStatusCode( dto.getStatusCode() );
        user.setCreatedBy( dto.getCreatedBy() );
        user.setCreatedData( dto.getCreatedData() );
        user.setLastModifiedBy( dto.getLastModifiedBy() );
        user.setLastModifiedData( dto.getLastModifiedData() );
        user.setFirstName( dto.getFirstName() );
        user.setLastName( dto.getLastName() );
        user.setEmail( dto.getEmail() );
        user.setPassword( dto.getPassword() );
        user.setRole( dto.getRole() );

        return user;
    }

    @Override
    public List<UserDto> maptoList(List<User> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( entityList.size() );
        for ( User user : entityList ) {
            list.add( map( user ) );
        }

        return list;
    }

    @Override
    public List<User> unmaptoList(List<UserDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtoList.size() );
        for ( UserDto userDto : dtoList ) {
            list.add( unmap( userDto ) );
        }

        return list;
    }
}
