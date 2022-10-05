package com.shop.adapter.api.order.domain.port;

import java.util.Map;

import com.shop.adapter.api.order.domain.dictionary.Delivery;
import com.shop.adapter.api.order.domain.dictionary.Payment;
import com.shop.adapter.api.order.domain.dictionary.Status;
import com.shop.adapter.api.order.domain.model.Article;
import com.shop.adapter.api.order.domain.model.Client;
import com.shop.adapter.api.order.domain.model.Order;

public interface OrderRepository {

  Integer save(
      Client client,
      Delivery delivery,
      Payment payment,
      Map<Article, Integer> article2quantity,
      Status status);

  Order get(Integer id);
}
