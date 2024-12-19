package com.shop.adapter.database;

import java.util.UUID;

import com.shop.domain.model.Article;
import lombok.Builder;

@Builder
class ArticleEntity {

  private UUID id;
  private String name;
  private Double price;

  static ArticleEntity of(Article article) {
    return ArticleEntity.builder()
        .id(UUID.fromString(article.getId().toString()))
        .name(article.getName())
        .price(article.getPrice())
        .build();
  }

  Article to() {
    return Article.builder().id(Integer.parseInt(id.toString())).name(name).price(price).build();
  }
}
