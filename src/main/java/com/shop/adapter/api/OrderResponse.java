package com.shop.adapter.api;

import com.shop.domain.model.Order;

record OrderResponse(Integer orderId) {

  public static OrderResponse of(Order order) {
    return new OrderResponse(order.getId());
  }
}
