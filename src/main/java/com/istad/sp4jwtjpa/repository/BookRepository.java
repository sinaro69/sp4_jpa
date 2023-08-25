package com.istad.sp4jwtjpa.repository;

import com.istad.sp4jwtjpa.entity.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {
    List<Book> findByTitleContainingIgnoreCaseOrderByStatusDesc(String title);
    List<Book> findByTitleStartingWithIgnoreCase(String title);


    @Query("SELECT b from e_books b WHERE b.author = ?1")
    List<Book> selectBookByAuthorName(String name);

    @Query("SELECT  b from e_books b where b.uuid = ?1")
    Optional<Book> selectBookByPrimaryKey(UUID primaryKey);

    @Modifying
    @Query("DELETE FROM e_books b WHERE b.status = ?1")
    void deleteBookByStatus(Boolean status);

}
