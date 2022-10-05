package com.shop.adapter.api.adapter.api;

import com.shop.adapter.api.order.domain.model.Order;
import com.shop.adapter.api.order.domain.port.OrderService;

class OrderApiService {

  private OrderService orderService;

  public OrderResponse get(Integer orderId) {

    Order order = orderService.get(orderId);
    return OrderResponse.of(order);
  }

  public Integer create(OrderRequest orderRequest) {

    return orderService.create(
        orderRequest.clientId(),
        orderRequest.article2quantity(),
        orderRequest.delivery(),
        orderRequest.payment());
  }
}
