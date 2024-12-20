package com.shop.domain.port;

import java.util.Map;
import java.util.stream.Collectors;

import com.shop.domain.dictionary.Delivery;
import com.shop.domain.dictionary.Payment;
import com.shop.domain.dictionary.Status;
import com.shop.domain.model.Article;
import com.shop.domain.model.Client;
import com.shop.domain.model.Order;
import lombok.Getter;

@Getter
public class OrderService {

  private ArticleRepository articleRepository;
  private ClientRepository clientRepository;
  private OrderRepository orderRepository;

  public Order get(Integer orderId) {
    return orderRepository.get(orderId);
  }

  public Integer create(
      Integer clientId, Map<Integer, Integer> article2quantity, String delivery, String payment) {

    Delivery deliveryEnum = Delivery.valueOf(delivery);
    Payment paymentEnum = Payment.valueOf(payment);
    Client client = clientRepository.get(clientId);

    Map<Article, Integer> article2qt =
        article2quantity.entrySet().stream()
            .map(entry -> Map.entry(articleRepository.get(entry.getKey()), entry.getValue()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    return orderRepository.save(client, deliveryEnum, paymentEnum, article2qt, Status.ACCEPTED);
  }
}
