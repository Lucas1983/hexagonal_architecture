package com.shop.adapter.api.adapter.media;

import com.shop.adapter.api.order.domain.model.Order;
import com.shop.adapter.api.order.domain.port.OrderPublisher;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SocialMediaOrderPublisher implements OrderPublisher {

  // social media client

  @Override
  public void publishUponCreation(Order order) {

    SocialMediaOrderPost post = SocialMediaOrderPost.of(order);
    // publish logic
    log.debug("Post about order: %d has been published!".formatted(order.getId()));
  }
}
