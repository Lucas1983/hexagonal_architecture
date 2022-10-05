package com.shop.adapter.api.adapter.api;

import com.shop.adapter.api.order.domain.model.Order;

record OrderResponse(Integer orderId) {

  public static OrderResponse of(Order order) {
    return new OrderResponse(order.getId());
  }
}
