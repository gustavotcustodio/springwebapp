package teste.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import teste.springframework.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
