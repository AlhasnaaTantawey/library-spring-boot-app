package com.dailycodework.ilibrary.Entity;

import com.dailycodework.ilibrary.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * @author Samson Effes
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Book extends BaseEntity<Long> {
    private String title;
    private String author;
    private String edition;
    private UUID isbn = UUID.randomUUID();
}
