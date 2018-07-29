package org.pakhomov.recipeapp.repository;

import org.pakhomov.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Victor Pakhomov
 * @since 29.07.18.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
