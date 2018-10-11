package com.boot.one.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.one.model.Book;
import com.boot.one.repository.BookRepository;

@Service
@Transactional
public class BookDAO {

	@Autowired
	BookRepository bookRepository;
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	public Book find(Long id) {
		return bookRepository.findOne(id);
	}
	public void delete(Long id) {
		bookRepository.deleteBook(0, id);
	}
}
