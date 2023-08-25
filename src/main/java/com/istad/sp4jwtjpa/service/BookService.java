package com.istad.sp4jwtjpa.service;

import com.istad.sp4jwtjpa.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    void deleteBookByStatus(Boolean status);

    List<Book> findAll();
}
