package com.zadoiko.bookstore.services;

import com.zadoiko.bookstore.model.Client;

public class ValidationService {
    boolean isValid (Client client){
        return client.getEmail().length()>3 && client.getEmail().contains("@");
    }
}
