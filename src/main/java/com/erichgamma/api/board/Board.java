package com.erichgamma.api.board;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class Board {
    private Long id;
    private String boardName;
    private String boardType;
}
