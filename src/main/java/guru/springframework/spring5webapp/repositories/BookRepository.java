package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fossil on 15.06.18.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
