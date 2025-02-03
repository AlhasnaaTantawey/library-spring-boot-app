package com.dailycodework.ilibrary.base;

import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;


@NoRepositoryBean
public interface BaseRepository <T , ID extends Number> extends JpaRepository<T, ID> {

}
