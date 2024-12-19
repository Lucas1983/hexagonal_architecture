package com.shop.adapter.database;

import java.util.Map;
import java.util.UUID;

import com.shop.domain.dictionary.Delivery;
import com.shop.domain.dictionary.Payment;
import com.shop.domain.model.Order;
import lombok.Builder;

@Builder
class OrderEntity {

  private UUID id;
  private ClientEntity client;
  private String delivery;
  private String payment;
  private Map<ArticleEntity, Integer> article2quantity;
  private Double totalCost;
  private String status;

  static OrderEntity of(Order order) {
    return OrderEntity.builder()
        .id(UUID.fromString(order.getId().toString()))
        .client(ClientEntity.of(order.getClient()))
        .delivery(order.getDelivery().toString())
        .payment(order.getPayment().toString())
        .article2quantity(null)
        .totalCost(order.getTotalCost())
        .status(order.getStatus())
        .build();
  }

  Order to() {
    return Order.builder()
        .id(Integer.parseInt(id.toString()))
        .client(client.to())
        .delivery(Delivery.valueOf(delivery))
        .payment(Payment.valueOf(payment))
        .article2quantity(null)
        .totalCost(totalCost)
        .status(status)
        .build();
  }
}
