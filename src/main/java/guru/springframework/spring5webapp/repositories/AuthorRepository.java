package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fossil on 15.06.18.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
