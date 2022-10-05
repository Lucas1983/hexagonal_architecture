package com.shop.adapter.api.order.domain.port;

import com.shop.adapter.api.order.domain.model.Client;

public interface ClientRepository {

  Integer save(String firstName, String lastName);

  Client get(Integer id);
}
