package com.erichgamma.api.article;

import com.erichgamma.api.board.Board;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="articles")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class Article {
    @Id
    @Column(name ="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String registerDate;


    @ManyToOne
    @JoinColumn(name = "board_id", nullable = true)
    private Board board;
}