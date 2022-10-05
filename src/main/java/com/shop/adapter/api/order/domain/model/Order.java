package com.shop.adapter.api.order.domain.model;

import java.util.Map;

import com.shop.adapter.api.order.domain.dictionary.Delivery;
import com.shop.adapter.api.order.domain.dictionary.Payment;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Order {

  private Integer id;
  private Client client;
  private Delivery delivery;
  private Payment payment;
  private Map<Article, Integer> article2quantity;
  private Double totalCost;
  private String status;
}
