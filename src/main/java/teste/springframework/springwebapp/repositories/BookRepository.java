package teste.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import teste.springframework.springwebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
