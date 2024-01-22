package com.vtnlab.bootcamp.lomboks;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String author;
    private LocalDate publishDate;
}
