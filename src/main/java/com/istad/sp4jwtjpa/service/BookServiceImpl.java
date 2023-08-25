package com.istad.sp4jwtjpa.service;

import com.istad.sp4jwtjpa.entity.Book;
import com.istad.sp4jwtjpa.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;
    @Override
    public void deleteBookByStatus(Boolean status) {
        bookRepository.deleteBookByStatus(status);
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
