package com.shop.adapter.api.order.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Client {

  private Integer id;
  private String firstName;
  private String lastName;
  private String address;
  private String email;
  private String phone;
}
