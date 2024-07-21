package com.coder.spring.graphql.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.spring.graphql.postgresql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}