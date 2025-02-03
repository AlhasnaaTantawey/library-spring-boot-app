package com.dailycodework.ilibrary.controller;

import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.dto.BookDto;
import com.dailycodework.ilibrary.service.imp.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

/**
 * @author Samson Effes
 */

@RestController
@RequestMapping("api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/all")
    public ResponseEntity<List<BookDto>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
    @GetMapping("/book/{id}")
    public BookDto getById(@PathVariable("id") Long bookId){
        return bookService.findById(bookId);
    }
    @PostMapping("/add")
    public ResponseEntity<BookDto> add(@RequestBody Book book){
        return new ResponseEntity<>(bookService.add(book), CREATED);
    }

    @PatchMapping("/update")
    public ResponseEntity<BookDto> update(@RequestBody Book theBook){
        return new ResponseEntity<>(bookService.update(theBook), OK);
    }

    @DeleteMapping("/book/delete/{id}")
    public void delete(@PathVariable("id") Long bookId){
        bookService.delete(bookId);
    }

}
