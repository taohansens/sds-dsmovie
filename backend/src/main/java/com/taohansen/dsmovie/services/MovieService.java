package com.taohansen.dsmovie.services;

import com.taohansen.dsmovie.dto.MovieDTO;
import com.taohansen.dsmovie.entities.Movie;
import com.taohansen.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(MovieDTO::new);
        return page;
    }
    public MovieDTO findById(Long id) {
        Movie result = repository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }
}
