package com.example.movie;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.movie.*;

@RestController
public class MovieController {
    MovieService movieService = new MovieService();

    @GetMapping("/movies")
    public ArrayList<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable("movieId") int movieId) {
        return movieService.getMovieById(movieId);

    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updatMovie(@PathVariable int movieId, @RequestBody Movie movie) {
        return movieService.updateMovie(movieId, movie);
    }

}
