package com.shop.adapter.api.adapter.notification.sms;

import com.shop.adapter.api.order.domain.model.Order;
import com.shop.adapter.api.order.domain.port.ClientNotifier;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ClientSmsNotifier implements ClientNotifier {

  @Override
  public void notifyAboutNewOrder(Order order) {

    ClientSmsNotification notification = ClientSmsNotification.of(order);
    // notification logic
    log.debug(
        "SMS notification about order: %d for client: %d sent!"
            .formatted(order.getId(), order.getClient().getId()));
  }
}
