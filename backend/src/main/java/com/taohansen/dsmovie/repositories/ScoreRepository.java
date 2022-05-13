package com.taohansen.dsmovie.repositories;

import com.taohansen.dsmovie.entities.Score;
import com.taohansen.dsmovie.entities.ScorePK;
import com.taohansen.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
