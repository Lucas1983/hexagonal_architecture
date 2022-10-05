package com.shop.adapter.notification.mail;

import com.shop.domain.model.Order;
import com.shop.domain.port.ClientNotifier;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ClientMailNotifier implements ClientNotifier {

  @Override
  public void notifyAboutNewOrder(Order order) {

    ClientMailNotification notification = ClientMailNotification.of(order);
    // notification logic
    log.debug(
        "Mail notification about order: %d for client: %d sent!"
            .formatted(order.getId(), order.getClient().getId()));
  }
}
