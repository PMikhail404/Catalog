package com.packet.entity;

import com.packet.enums.SeatCategory;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * Цена сеанса
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "session_price")
public class SessionPrice {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Сеанс
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id", nullable = false)
    private MovieSession movieSession;

    /**
     * Категория
     */
    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private SeatCategory category;

    /**
     * Цена
     */
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
}
