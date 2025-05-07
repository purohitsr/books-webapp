package com.example.books;


import java.security.Provider.Service;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.books.Book;
import com.example.books.BookService;

public class BookServiseTest {
	
	@Test
	public void testGetBookReturnsNonEmptyLists() {
		BookService service = new BookService();
		List<Book> books = service.getBooks();
		
		Assert.assertFalse(books.isEmpty());
	    Assert.assertEquals("The Great Gat", books.get(0).getTitle());
	}

}
