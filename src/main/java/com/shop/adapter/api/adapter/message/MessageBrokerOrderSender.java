package com.shop.adapter.api.adapter.message;

import com.shop.adapter.api.order.domain.model.Order;
import com.shop.adapter.api.order.domain.port.OrderMsgSender;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class MessageBrokerOrderSender implements OrderMsgSender {

  // message broker client

  @Override
  public void sendMsgWhenCreated(Order order) {

    OrderMessage message = OrderMessage.of(order);
    // sending logic
    log.debug("Message about order: %d creation sent to Message Broker".formatted(order.getId()));
  }

  @Override
  public void sendMsgWhenRetrieved(Order order) {

    OrderMessage message = OrderMessage.of(order);
    // sending logic
    log.debug("Message about order: %d retrieval sent to Message Broker".formatted(order.getId()));
  }
}
