package com.dailycodework.ilibrary.repository;

import com.dailycodework.ilibrary.Entity.Book;
import com.dailycodework.ilibrary.base.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends BaseRepository<Book,Long> {
}
