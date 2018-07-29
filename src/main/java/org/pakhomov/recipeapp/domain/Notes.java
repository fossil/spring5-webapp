package org.pakhomov.recipeapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author Victor Pakhomov
 * @since 14.07.18.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;

}
