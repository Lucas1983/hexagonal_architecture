package com.shop.adapter.api.order.domain.port;

import com.shop.adapter.api.order.domain.model.Order;

public interface ClientNotifier {

  void notifyAboutNewOrder(Order order);
}
