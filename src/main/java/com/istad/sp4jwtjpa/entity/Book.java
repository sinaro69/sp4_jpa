package com.istad.sp4jwtjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity(name = "e_books")
@Table(name = "books")
@ToString
@NoArgsConstructor
@Data
public class Book {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String author;
    private String title;
    private Boolean status;



}
