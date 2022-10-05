package com.shop.adapter.database;

import lombok.Builder;

@Builder
class OrderArticleEntity {

  private Integer orderId;
  private Integer clientId;
}
