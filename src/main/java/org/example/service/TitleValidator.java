package org.example.service;

import org.example.domain.Book;

public class TitleValidator implements IValidator{


    @Override
    public boolean validate(Book book) {
        return false;
    }
}
