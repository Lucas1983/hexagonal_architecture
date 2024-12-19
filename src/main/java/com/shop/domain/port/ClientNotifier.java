package com.shop.domain.port;

import com.shop.domain.model.Order;

public interface ClientNotifier {

  void notifyAboutNewOrder(Order order);
}
