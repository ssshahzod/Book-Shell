package com.studying.bookshell.repositories;

import org.springframework.data.repository.CrudRepository;
import com.studying.bookshell.domain.Books;

public interface BookRepository extends CrudRepository<Books, Long> {

}
