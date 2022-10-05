package com.shop.adapter.api.adapter.media;

import com.shop.adapter.api.order.domain.model.Order;
import lombok.Builder;

@Builder
class SocialMediaOrderPost {

  private static final String POST_TEXT = "New order: %d made by %s has been submitted !";
  private final String login;
  private final String post;

  static SocialMediaOrderPost of(Order order) {

    var login = String.join(" ", order.getClient().getFirstName(), order.getClient().getLastName());
    return SocialMediaOrderPost.builder()
        .login(login)
        .post(POST_TEXT.formatted(order.getId(), login))
        .build();
  }
}
