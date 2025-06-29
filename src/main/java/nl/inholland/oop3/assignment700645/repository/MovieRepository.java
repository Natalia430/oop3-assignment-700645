package nl.inholland.oop3.assignment700645.repository;

import nl.inholland.oop3.assignment700645.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}

