package com.shop.adapter.message;

import com.shop.domain.model.Order;
import com.shop.domain.port.OrderMsgSender;
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
