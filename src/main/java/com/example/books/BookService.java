package com.example.books;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Great Gatsby", "Scott Fitzgerald"));
        books.add(new Book(2, "Nineteen Eighty-Four", "George Orwell"));
        return books;
    }
}