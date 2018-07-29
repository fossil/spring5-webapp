package org.pakhomov.recipeapp.services;

import org.pakhomov.recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Victor Pakhomov
 * @since 29.07.18.
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
