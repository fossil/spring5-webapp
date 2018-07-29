package org.pakhomov.recipeapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.pakhomov.recipeapp.domain.Category;
import org.pakhomov.recipeapp.domain.UnitOfMeasure;
import org.pakhomov.recipeapp.repository.CategoryRepository;
import org.pakhomov.recipeapp.repository.UnitOfMeasureRepository;
import org.pakhomov.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @author Victor Pakhomov
 * @since 14.07.18.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        log.debug("Getting Index Page");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
