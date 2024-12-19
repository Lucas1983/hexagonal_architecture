package com.shop.adapter.message;

import java.time.ZonedDateTime;

import com.shop.domain.model.Order;
import lombok.Builder;

@Builder
class OrderMessage {

  private final Order order;
  private final ZonedDateTime sentAt;

  static OrderMessage of(Order order) {
    return OrderMessage.builder().order(order).sentAt(ZonedDateTime.now()).build();
  }
}
