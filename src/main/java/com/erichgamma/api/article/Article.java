package com.erichgamma.api.article;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class Article {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String registerDate;
}