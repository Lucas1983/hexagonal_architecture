package com.shop.adapter.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/order")
class OrderEndpoint {

  private OrderApiService apiService;

  @GET()
  @Path("/{id}")
  public OrderResponse get(Integer id) {
    return apiService.get(id);
  }

  @POST
  @Path("/new")
  public Integer create(OrderRequest orderRequest) {
    return apiService.create(orderRequest);
  }
}
