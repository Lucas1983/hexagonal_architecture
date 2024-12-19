package com.shop.adapter.database;

import java.util.UUID;

import com.shop.domain.model.Client;
import lombok.Builder;

@Builder
class ClientEntity {

  private UUID id;
  private String firstName;
  private String lastName;
  private String address;
  private String email;
  private String phone;

  static ClientEntity of(Client client) {
    return ClientEntity.builder()
        .id(UUID.fromString(client.getId().toString()))
        .firstName(client.getFirstName())
        .lastName(client.getLastName())
        .address(client.getAddress())
        .email(client.getEmail())
        .phone(client.getPhone())
        .build();
  }

  Client to() {
    return Client.builder()
        .id(Integer.parseInt(id.toString()))
        .firstName(firstName)
        .lastName(lastName)
        .address(address)
        .email(email)
        .phone(phone)
        .build();
  }
}
