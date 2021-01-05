package com.zadoiko.bookstore.services;

import com.zadoiko.bookstore.model.Client;

import java.util.Optional;

public interface ClientService {
    Client createClient (Client client);
    Iterable<Client> getAllClients();

    Optional<Client> getAllClients(Long clientId);
}
