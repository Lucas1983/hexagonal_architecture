package com.shop.adapter.api.adapter.database;

import lombok.Builder;

@Builder
class OrderArticleEntity {

  private Integer orderId;
  private Integer clientId;
}
