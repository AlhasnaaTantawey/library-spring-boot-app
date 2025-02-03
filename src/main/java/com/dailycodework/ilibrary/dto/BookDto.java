package com.dailycodework.ilibrary.dto;


import com.dailycodework.ilibrary.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto extends BaseDto<Long> {

    private String title;
    private String author;
    private String edition;
    private UUID isbn = UUID.randomUUID();

}
