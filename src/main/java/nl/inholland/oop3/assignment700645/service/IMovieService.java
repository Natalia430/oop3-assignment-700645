package nl.inholland.oop3.assignment700645.service;

import nl.inholland.oop3.assignment700645.model.Movie;

import java.util.List;
import java.util.Optional;

public interface IMovieService {
    List<Movie> getAllMovies(int page, int size);
    Optional<Movie> getMovieById(Long id);
    Movie addMovie(Movie movie);
    Movie updateMovie(Movie movie);
    void deleteMovie(Long id);
}
