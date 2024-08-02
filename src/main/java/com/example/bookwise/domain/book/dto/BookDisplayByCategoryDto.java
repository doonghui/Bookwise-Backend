package com.example.bookwise.domain.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class BookDisplayByCategoryDto {
    String category;
    List<BookDisplayDto> bookDisplayDto;
}
