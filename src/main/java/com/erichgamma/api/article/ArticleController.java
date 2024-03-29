package com.erichgamma.api.article;

import java.util.Map;
import java.util.stream.LongStream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erichgamma.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleServiceImpl articleServiceImpl;
    private final ArticleRepository articleRepository;

    @GetMapping(path = "/api/articles/all-articles")
    public Map<?, ?> findAll(){
        // return Map.of(
            // "articles", LongStream.range(0, 5)
            // .mapToObj(i -> Article.builder()
            // .id(i)
            // .title("test_title" + i)
            // .content("test_content" + i)
            // .writer("test_writer" + i)
            // .registerDate("test_registerDate" + i)
            // .build()).toList());
        return Map.of(
            "message", Messenger.SUCCESS,
            "articles", Article.builder()
            .id((long)0)
            .title("test title")
            .content("test content")
            .registerDate("test registerDate")
            .build()
        );
    }
}