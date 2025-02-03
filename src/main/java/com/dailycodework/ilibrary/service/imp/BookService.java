package com.dailycodework.ilibrary.service.imp;

import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.dto.BookDto;
import com.dailycodework.ilibrary.mapper.BookMapper;
import com.dailycodework.ilibrary.repository.BookRepository;
import com.dailycodework.ilibrary.exception.BookNotFoundException;
import com.dailycodework.ilibrary.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Samson Effes
 */

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> list   = bookRepository.findAll();
           return bookMapper.maptoList(list);
    }

    @Override
    public BookDto add(Book book) {
      Book book1=  bookRepository.save(book);
       BookDto  bookDto  =  bookMapper.map(book1);
        return bookDto;
    }

    @Override
    public BookDto findById(Long bookId) {
     Optional<Book> book=   bookRepository.findById(bookId);
      if(book.isPresent()){
          BookDto bookDto=  bookMapper.map(book.get());
          return bookDto;
      }
      else {
          throw new BookNotFoundException("No book found with the id : " + bookId);
      }
    }

    @Override
    public void delete(Long bookId) {
        BookDto book = findById(bookId);
        if (book!=null){
            bookRepository.deleteById(book.getId());
        }
        else {
            throw  new BookNotFoundException("No book found with the id : " + bookId);
        }
    }

    @Override
    public BookDto update(Book book) {
        BookDto bookDto  = findById(book.getId());
        if (bookDto!=null){
            Book book1= bookRepository.save(book);
            return bookMapper.map(book1);
        }
        else {
            throw  new BookNotFoundException("No book found with the id : " + book.getId());

        }

    }
}
