package com.example.books;

public class Book {
	private int id;
    private String title;
    private String author;

    // Constructors, Getters, Setters
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

}
