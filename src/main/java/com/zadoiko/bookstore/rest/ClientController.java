package com.zadoiko.bookstore.rest;

import com.zadoiko.bookstore.dao.ClientDao;
import com.zadoiko.bookstore.model.Book;
import com.zadoiko.bookstore.model.Client;
import com.zadoiko.bookstore.services.BookServices;
import com.zadoiko.bookstore.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class ClientController {

    @Autowired
    ClientService clientService;


    @RequestMapping(value ="/clients", method = RequestMethod.POST)
    public Client createClint(@RequestBody Client client){
        return clientService.createClient(client);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public Iterable<Client> getAllClients(@RequestBody Client client){
        return clientService.getAllClients();
    }


    }


