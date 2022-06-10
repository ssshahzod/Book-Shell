package com.studying.bookshell.repositories;

import com.studying.bookshell.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    //SpringDataJPA is gonna provide implementation at runtime
    //We have done everything we need to cofigure repositories for our 2 entities BookRepository and AuthorRepository.
}
