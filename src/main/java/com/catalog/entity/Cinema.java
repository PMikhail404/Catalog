package com.catalog.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Кинотеатр
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cinema")
public class Cinema {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Название
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Адрес
     */
    @Column(name = "address", nullable = false)
    private String address;
}
