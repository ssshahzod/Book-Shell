package com.studying.bookshell.repositories;

import com.studying.bookshell.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
