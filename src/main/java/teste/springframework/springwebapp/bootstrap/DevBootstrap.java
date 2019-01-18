package teste.springframework.springwebapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import teste.springframework.springwebapp.model.Author;
import teste.springframework.springwebapp.model.Book;
import teste.springframework.springwebapp.repositories.AuthorRepository;
import teste.springframework.springwebapp.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Author eric = new Author ("Eric", "Evans");
        Book ddd =  new Book ( "Domain Driven Design", "1234", "Harper Collins" );
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save (ddd);

        Author rod = new Author ("Rod", "Johnson");
        Book noEJB = new Book ("J2EEE Dev", "23444", "Worx");
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save (noEJB);
    }
}
