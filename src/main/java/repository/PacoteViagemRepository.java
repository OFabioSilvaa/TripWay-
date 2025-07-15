package com.tripway.tripway.repository;

import com.tripway.tripway.model.PacoteViagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacoteViagemRepository extends JpaRepository<PacoteViagem, Long> {
}