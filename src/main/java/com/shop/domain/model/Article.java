package com.shop.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Article {

  private Integer id;
  private String name;
  private Double price;
}
