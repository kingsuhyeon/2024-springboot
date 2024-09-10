package org.example.ch05.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.ch05.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
public class AddArticleRequest {

    private String title;
    private String content;

    public Article toEntity() {
        return Article.builder().title(title).content(content).build();
    }


}
