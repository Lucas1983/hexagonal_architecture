package com.shop.adapter.api.order.domain.port;

import com.shop.adapter.api.order.domain.model.Order;

public interface OrderMsgSender {

  public void sendMsgWhenCreated(Order order);

  public void sendMsgWhenRetrieved(Order order);
}
