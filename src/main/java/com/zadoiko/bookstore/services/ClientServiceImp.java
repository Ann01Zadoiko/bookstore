package com.zadoiko.bookstore.services;

import com.zadoiko.bookstore.dao.ClientDao;
import com.zadoiko.bookstore.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    ClientDao clientDao;

    @Autowired
    ValidationService validationService;

    @Override
    public Client createClient(Client client) {
      if ( validationService.isValid(client)){
        return clientDao.save(client);
      }
      return null;
    }

    @Override
    public Iterable<Client> getAllClients() {
        return clientDao.findAll();
    }

    @Override
    public Optional<Client> getAllClients(Long clientId) {
        return clientDao.findById(clientId);
    }
}
