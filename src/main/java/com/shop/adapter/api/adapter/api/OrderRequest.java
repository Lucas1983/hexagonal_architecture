package com.shop.adapter.api.adapter.api;

import java.util.Map;

record OrderRequest(
    Integer clientId, Map<Integer, Integer> article2quantity, String delivery, String payment) {}
