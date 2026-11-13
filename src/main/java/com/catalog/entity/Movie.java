package com.catalog.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Фильм
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Наименование
     */
    @Column(name = "title", nullable = false)
    private String title;

    /**
     * Время в минутах
     */
    @Column(name = "duration_minutes", nullable = false)
    private Integer durationMinutes;
}
