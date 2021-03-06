package com.book.api.apigateway.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RatingDto {
    private BigDecimal averageGrade;
    private Long bookId;
}
