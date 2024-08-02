package com.example.bookwise.domain.book.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookDisplayDto {

    private String isbn13;
    private String coverURL;
}
