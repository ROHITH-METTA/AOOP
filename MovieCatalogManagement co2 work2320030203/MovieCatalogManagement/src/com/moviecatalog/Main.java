package com.moviecatalog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieCatalog catalog = new MovieCatalog();
        Scanner scanner = new Scanner(System.in);

        // Adding sample movies
        catalog.addMovie(new Movie("Inception", "Christopher Nolan", 2010));
        catalog.addMovie(new Movie("The Godfather", "Francis Ford Coppola", 1972));
        catalog.addMovie(new Movie("Pulp Fiction", "Quentin Tarantino", 1994));

        // Display all movies
        System.out.println("Movies in Catalog:");
        for (Movie movie : catalog) {
            System.out.println(movie);
        }

        // Sort movies by title
        System.out.println("\nSorting movies by title...");
        catalog.sortMovies();

        // Display sorted movies
        System.out.println("Sorted Movies by Title:");
        for (Movie movie : catalog) {
            System.out.println(movie);
        }

        // Search for a movie
        System.out.print("\nEnter a movie title to search: ");
        String titleToSearch = scanner.nextLine();
        Movie foundMovie = catalog.findMovie(titleToSearch);
        if (foundMovie != null) {
            System.out.println("Found: " + foundMovie);
        } else {
            System.out.println("Movie not found.");
        }

        scanner.close();
    }
}
