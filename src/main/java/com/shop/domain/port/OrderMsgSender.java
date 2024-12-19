package com.shop.domain.port;

import com.shop.domain.model.Order;

public interface OrderMsgSender {

  public void sendMsgWhenCreated(Order order);

  public void sendMsgWhenRetrieved(Order order);
}
