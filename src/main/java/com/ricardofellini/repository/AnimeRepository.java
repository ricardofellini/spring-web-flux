package com.ricardofellini.repository;

import com.ricardofellini.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {
}
