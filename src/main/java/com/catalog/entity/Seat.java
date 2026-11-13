package com.catalog.entity;

import com.catalog.enums.SeatCategory;
import jakarta.persistence.*;
import lombok.*;

/**
 * Место
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "seat")
public class Seat {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seat_gen")
    @SequenceGenerator(name = "seat_gen", sequenceName = "seat_seq", allocationSize = 100)
    private Long id;

    /**
     * Зал
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id", nullable = false)
    private Hall hall;

    /**
     * Категория
     */
    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private SeatCategory category;

    /**
     * Ряд
     */
    @Column(name = "row_number", nullable = false)
    private Integer rowNumber;

    /**
     * Номер места
     */
    @Column(name = "seat_number", nullable = false)
    private Integer seatNumber;
}
