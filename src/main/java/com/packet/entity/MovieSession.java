package com.packet.entity;

import com.packet.enums.SessionStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

/**
 * Сеанс
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie_session")
public class MovieSession {
    /**
     * Идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Зал
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hall_id", nullable = false)
    private Hall hall;

    /**
     * Фильм
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    /**
     * Время начала
     */
    @Column(name = "start_time", nullable = false)
    private Instant startTime;

    /**
     * Время конца
     */
    @Column(name = "end_time", nullable = false)
    private Instant endTime;

    /**
     * Статус
     */
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private SessionStatus status;
}
