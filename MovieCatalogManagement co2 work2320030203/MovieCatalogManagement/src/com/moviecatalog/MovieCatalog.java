package com.moviecatalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MovieCatalog implements Iterable<Movie> {
    private List<Movie> movies;

    public MovieCatalog() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void sortMovies() {
        Collections.sort(movies);
    }

    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
    
    public Movie findMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }
}
