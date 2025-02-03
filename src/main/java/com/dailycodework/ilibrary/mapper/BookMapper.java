package com.dailycodework.ilibrary.mapper;

import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.dto.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface BookMapper {
    //map from book entity to dto
    BookDto map(Book entity);

    //map from  dto to book entity
    Book unmap(BookDto dto);

    //map from list<entity> to list<dto>
    List<BookDto> maptoList(List<Book> entityList);

    //map from list<dto> to list<entity>
    List<Book> unmaptoList(List<BookDto> dtoList);
}
