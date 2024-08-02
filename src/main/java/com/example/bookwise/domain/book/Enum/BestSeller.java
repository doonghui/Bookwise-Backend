package com.example.bookwise.domain.book.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum BestSeller {
    BEST_SELLER("베스트"),
    TEENAGER("청소년"),
    COMPUTER_MOBILE("청년"),
    ELEMENTARY_TEXTBOOK("장년");

    private final String value;

    BestSeller(String value) {
        this.value = value;
    }

}
