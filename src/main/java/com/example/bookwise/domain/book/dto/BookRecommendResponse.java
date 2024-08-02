package com.example.bookwise.domain.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookRecommendResponse {

    List<String> wishcategories;
    List<BookDisplayDto>userRecommend;
    List<BookDisplayDto>preferOne;
    List<BookDisplayDto>preferTwo;



}


