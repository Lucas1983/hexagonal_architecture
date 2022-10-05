package com.shop.adapter.api.order.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Article {

  private Integer id;
  private String name;
  private Double price;
}
