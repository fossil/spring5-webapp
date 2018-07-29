package org.pakhomov.recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Victor Pakhomov
 * @since 28.07.18.
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
