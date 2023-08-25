package com.istad.sp4jwtjpa;

import com.istad.sp4jwtjpa.entity.Book;
import com.istad.sp4jwtjpa.repository.BookRepository;
import com.istad.sp4jwtjpa.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class Sp4JwtJpaApplication implements CommandLineRunner {


    private final BookRepository bookRepository;
    private final BookService bookService;
    @Autowired
    public Sp4JwtJpaApplication(BookRepository bookRepository,BookService bookService) {
        this.bookRepository = bookRepository;
        this.bookService=bookService;
    }



    public static void main(String[] args) {
        SpringApplication.run(Sp4JwtJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Book book = new Book();
//        book.setTitle("The lord of the ring ");
//        bookRepository.save(book);
//
//        System.out.println(bookRepository.findAll());
//
//        Book book2 =new Book();
//        book2.setTitle("The way you are ");
//        bookRepository.save(book2);
//        System.out.println(bookRepository.findAll());


//        System.out.println(bookRepository.findByTitleContainingIgnoreCaseOrderByStatusDesc("a"));
//        System.out.println(bookRepository.findByTitleStartingWithIgnoreCase("d"));

        System.out.println(bookRepository.selectBookByAuthorName("Dara"));
        System.out.println(bookRepository.selectBookByPrimaryKey(UUID.fromString("fd8045b7-6a99-442a-8183-532b05f96917")));



    }
}
