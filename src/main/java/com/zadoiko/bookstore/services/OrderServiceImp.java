package com.zadoiko.bookstore.services;

import com.zadoiko.bookstore.dao.OrderDao;
import com.zadoiko.bookstore.model.Book;
import com.zadoiko.bookstore.model.Client;
import com.zadoiko.bookstore.model.Order;
import com.zadoiko.bookstore.rest.request.CreateOrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    OrderDao orderDao;

    @Autowired
    ClientService clientService;

    @Autowired
    BookServices bookServices;

    @Override
    public Long createOrder(CreateOrderRequest request) {
        Order order = new Order();
        List<Book> books = bookServices.findBookByIdIn(request.getBooks());
        Optional<Client> client = clientService.getAllClients(request.getClientId());
        if (client.isPresent()){
            Client client1 = client.get();
            order.setClient(client1);
            order.setBooks(books);
            order = orderDao.save(order);
           return order.getId();
        }
        return 0L;
    }

    @Override
    public Iterable<Order> getAllOrders() {
        return orderDao.findAll();
    }
}
