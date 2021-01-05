package com.zadoiko.bookstore.services;

import com.zadoiko.bookstore.model.Client;
import com.zadoiko.bookstore.model.Order;
import com.zadoiko.bookstore.rest.request.CreateOrderRequest;

public interface OrderService {
    Long createOrder (CreateOrderRequest request);
    Iterable<Order> getAllOrders();
}
