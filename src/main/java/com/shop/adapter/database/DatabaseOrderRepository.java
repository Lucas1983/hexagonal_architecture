package com.shop.adapter.database;

import java.util.Map;

import com.shop.domain.dictionary.Delivery;
import com.shop.domain.dictionary.Payment;
import com.shop.domain.dictionary.Status;
import com.shop.domain.model.Article;
import com.shop.domain.model.Client;
import com.shop.domain.model.Order;
import com.shop.domain.port.OrderRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DatabaseOrderRepository implements OrderRepository {

  // database client

  @Override
  public Integer save(
      Client client,
      Delivery delivery,
      Payment payment,
      Map<Article, Integer> article2quantity,
      Status status) {

    // save client if no exist
    // save article if no exist
    // save order

    Order order = OrderEntity.of(Order.builder().build()).to();
    log.debug("Order: %d saved to database".formatted(order.getId()));
    return order.getId();
  }

  @Override
  public Order get(Integer id) {

    Order order = OrderEntity.builder().build().to();
    log.debug("Order: %d retrieved from database".formatted(order.getId()));
    return order;
  }
}
