package com.zadoiko.bookstore.rest;

import com.zadoiko.bookstore.model.Client;
import com.zadoiko.bookstore.model.Order;
import com.zadoiko.bookstore.rest.request.CreateOrderRequest;
import com.zadoiko.bookstore.services.ClientService;
import com.zadoiko.bookstore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;


    @RequestMapping(value ="/orders", method = RequestMethod.POST)
    public Long createOrder(@RequestBody CreateOrderRequest request){
        return orderService.createOrder(request);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public Iterable<Order> getAlLOrders(){
        return orderService.getAllOrders();
    }


}
