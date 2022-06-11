package com.studying.bookshell.bootstrap;

import com.studying.bookshell.domain.Author;
import com.studying.bookshell.domain.Books;
import com.studying.bookshell.domain.Publisher;
import com.studying.bookshell.repositories.AuthorRepository;
import com.studying.bookshell.repositories.BookRepository;
import com.studying.bookshell.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Spring is gonna search for that type and gonna run it
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setCity("Moscow");
        publisher.setFirstName("Alex");
        publisher.setStreet("Sadovaya");
        publisher.setState("Moscow");

        publisherRepository.save(publisher);

        System.out.println("Number of Publishers: " + publisherRepository.count());

        Author Eric = new Author("Eric", "Evans");
        Books bok = new Books("Domain Driven Design", "12313");
        Eric.getBooks().add(bok);
        bok.getAuthors().add(Eric);
        bok.setPublisher(publisher);

        publisher.getBooks().add(bok);

        authorRepository.save(Eric);
        bookRepository.save(bok); //this is gonna save those into H2 DB
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Hod");
        Books noEJB = new Books("J2EE", "31321");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);

        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher number of books: " + publisher.getBooks().size());
    }
}
