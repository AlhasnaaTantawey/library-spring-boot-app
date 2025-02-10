package com.dailycodework.ilibrary.mapper;

import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.dto.BookDto;
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
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto map(Book entity) {
        if ( entity == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( entity.getId() );
        bookDto.setStatusCode( entity.getStatusCode() );
        bookDto.setCreatedBy( entity.getCreatedBy() );
        bookDto.setCreatedData( entity.getCreatedData() );
        bookDto.setLastModifiedBy( entity.getLastModifiedBy() );
        bookDto.setLastModifiedData( entity.getLastModifiedData() );
        bookDto.setTitle( entity.getTitle() );
        bookDto.setAuthor( entity.getAuthor() );
        bookDto.setEdition( entity.getEdition() );
        bookDto.setIsbn( entity.getIsbn() );

        return bookDto;
    }

    @Override
    public Book unmap(BookDto dto) {
        if ( dto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( dto.getId() );
        book.setStatusCode( dto.getStatusCode() );
        book.setCreatedBy( dto.getCreatedBy() );
        book.setCreatedData( dto.getCreatedData() );
        book.setLastModifiedBy( dto.getLastModifiedBy() );
        book.setLastModifiedData( dto.getLastModifiedData() );
        book.setTitle( dto.getTitle() );
        book.setAuthor( dto.getAuthor() );
        book.setEdition( dto.getEdition() );
        book.setIsbn( dto.getIsbn() );

        return book;
    }

    @Override
    public List<BookDto> maptoList(List<Book> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( entityList.size() );
        for ( Book book : entityList ) {
            list.add( map( book ) );
        }

        return list;
    }

    @Override
    public List<Book> unmaptoList(List<BookDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( dtoList.size() );
        for ( BookDto bookDto : dtoList ) {
            list.add( unmap( bookDto ) );
        }

        return list;
    }
}
