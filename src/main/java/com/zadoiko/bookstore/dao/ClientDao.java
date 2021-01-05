package com.zadoiko.bookstore.dao;

import com.zadoiko.bookstore.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends CrudRepository<Client, Long> {
}
