package nl.inholland.oop3.assignment700645.service;

import nl.inholland.oop3.assignment700645.model.Movie;
import nl.inholland.oop3.assignment700645.repository.MovieRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MovieServiceTest {

    private MovieRepository movieRepository;
    private MovieService movieService;

    @BeforeEach
    public void setUp() {
        movieRepository = Mockito.mock(MovieRepository.class);
        movieService = new MovieService(movieRepository);
    }

    @Test
    public void testGetAllMoviesFiltersLowRated() {
        Movie m1 = new Movie(); m1.setTitle("A"); m1.setRating(0);
        Movie m2 = new Movie(); m2.setTitle("B"); m2.setRating(3);

        Page<Movie> mockPage = new PageImpl<>(List.of(m1, m2));
        when(movieRepository.findAll(PageRequest.of(0, 10))).thenReturn(mockPage);

        List<Movie> result = movieService.getAllMovies(0, 10);

        assertEquals(1, result.size());
        assertEquals("B", result.get(0).getTitle());
    }
}
