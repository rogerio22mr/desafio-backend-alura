package br.com.alura.backend;

import br.com.alura.backend.movies.SearchMovies;

public class Main {

	public static void main(String[] args) {
		
		SearchMovies listMovies = new SearchMovies(/*Link da Api da IMDB*/);
		String movies = listMovies.search();
		
		
		System.out.println(movies);

	}

}
