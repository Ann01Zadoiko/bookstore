package com.zadoiko.bookstore.rest.request;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {
     private Long clientId;
     private List<Long> books;
}
