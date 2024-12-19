package com.shop.adapter.api.adapter.api;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import com.shop.adapter.api.OrderResponse;
import com.shop.domain.model.Order;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class OrderEndpointTest {

  @Test
  public void testOrderEndpoint() {
    given()
        .when()
        .get("/1")
        .then()
        .statusCode(200)
        .body(is(OrderResponse.of(Order.builder().build())));
  }
}
