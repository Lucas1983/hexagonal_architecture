package com.shop.adapter.api.order.domain.port;

import com.shop.adapter.api.order.domain.model.Article;

public interface ArticleRepository {

  Integer save(String name, Double price);

  Article get(Integer id);
}
