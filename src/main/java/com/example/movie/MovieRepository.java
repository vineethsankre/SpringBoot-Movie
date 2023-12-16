package com.example.movie;

import java.util.*;
import com.example.movie.*;

public interface MovieRepository {
    ArrayList<Movie> getAllMovies();

    Movie getMovieById(int movieId);

    Movie addMovie(Movie movie);

    Movie updateMovie(int movieId, Movie movie);

}
