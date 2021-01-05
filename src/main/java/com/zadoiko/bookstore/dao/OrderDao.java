package com.zadoiko.bookstore.dao;

import com.zadoiko.bookstore.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends CrudRepository<Order, Long> {
}
