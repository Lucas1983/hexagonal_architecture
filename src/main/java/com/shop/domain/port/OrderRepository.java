package com.shop.domain.port;

import java.util.Map;

import com.shop.domain.dictionary.Delivery;
import com.shop.domain.dictionary.Payment;
import com.shop.domain.dictionary.Status;
import com.shop.domain.model.Article;
import com.shop.domain.model.Client;
import com.shop.domain.model.Order;

public interface OrderRepository {

  Integer save(
      Client client,
      Delivery delivery,
      Payment payment,
      Map<Article, Integer> article2quantity,
      Status status);

  Order get(Integer id);
}
