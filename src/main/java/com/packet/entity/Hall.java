package com.packet.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Зал
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hall")
public class Hall {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Кинотеатр
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema;

    /**
     * Наименование
     */
    @Column(name = "name", nullable = false)
    private String name;
}
