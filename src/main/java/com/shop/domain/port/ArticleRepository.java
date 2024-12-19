package com.shop.domain.port;

import com.shop.domain.model.Article;

public interface ArticleRepository {

  Integer save(String name, Double price);

  Article get(Integer id);
}
