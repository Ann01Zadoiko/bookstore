package com.zadoiko.bookstore.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Author {
    @Column(length = 32)
    String name;
    String surname;
}
