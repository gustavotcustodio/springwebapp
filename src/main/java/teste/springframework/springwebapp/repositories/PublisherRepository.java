package teste.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import teste.springframework.springwebapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
