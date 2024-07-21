package com.coder.spring.graphql.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.spring.graphql.postgresql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
