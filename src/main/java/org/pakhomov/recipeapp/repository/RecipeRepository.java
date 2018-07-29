package org.pakhomov.recipeapp.repository;

import org.pakhomov.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Victor Pakhomov
 * @since 29.07.18.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
