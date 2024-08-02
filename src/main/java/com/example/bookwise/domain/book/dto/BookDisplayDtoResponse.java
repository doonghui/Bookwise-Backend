package com.example.bookwise.domain.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@AllArgsConstructor
@Getter
public class BookDisplayDtoResponse {
    private List<BookDisplayByCategoryDto> bookDisplayByCategoryDto;

}
