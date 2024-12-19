package com.shop.adapter.notification.sms;

import com.shop.domain.model.Order;
import lombok.Builder;

@Builder
class ClientSmsNotification {

  private String phoneNumber;
  private String text;

  static ClientSmsNotification of(Order order) {
    return ClientSmsNotification.builder()
        .phoneNumber(order.getClient().getPhone())
        .text(
            "Check your email ! We've just sent you email with order %d details !"
                .formatted(order.getId()))
        .build();
  }
}
