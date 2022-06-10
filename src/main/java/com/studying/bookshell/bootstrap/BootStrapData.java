package com.studying.bookshell.bootstrap;

import com.studying.bookshell.domain.Author;
import com.studying.bookshell.domain.Books;
import com.studying.bookshell.repositories.AuthorRepository;
import com.studying.bookshell.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;

//Spring is gonna search for that type and gonna run it
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author Eric = new Author("Eric", "Evans");
        Books bok = new Books("Domain Driven Design", "12313");
        Eric.getBooks().add(bok);
        bok.getAuthors().add(Eric);

        authorRepository.save(Eric);
        bookRepository.save(bok); //this is gonna save those into H2 DB

        Author rod = new Author("Rod", "Hod");
        Books noEJB = new Books("J2EE", "31321");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
    }
}
