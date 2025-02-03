package com.dailycodework.ilibrary.service;

import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface IBookService  {
    List<BookDto> getAllBooks();
    BookDto add(Book book);
  BookDto findById(Long bookId);
    void delete(Long bookId);
    BookDto update(Book book);
}
