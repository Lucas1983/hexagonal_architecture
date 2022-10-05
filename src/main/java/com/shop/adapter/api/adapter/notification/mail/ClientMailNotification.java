package com.shop.adapter.api.adapter.notification.mail;

import com.shop.adapter.api.order.domain.model.Order;
import lombok.Builder;

@Builder
class ClientMailNotification {

  private final String email;
  private final String title;
  private final Order order;

  static ClientMailNotification of(Order order) {
    return ClientMailNotification.builder()
        .order(order)
        .email(order.getClient().getEmail())
        .title("Your order %d has been accepted !".formatted(order.getId()))
        .build();
  }
}
