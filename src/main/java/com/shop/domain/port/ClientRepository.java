package com.shop.domain.port;

import com.shop.domain.model.Client;

public interface ClientRepository {

  Integer save(String firstName, String lastName);

  Client get(Integer id);
}
