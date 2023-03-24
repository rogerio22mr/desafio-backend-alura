package br.com.alura.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.alura.backend.movies.SearchMovies;

public class Main {

	public static void main(String[] args) {
		
		SearchMovies listMovies = new SearchMovies("https://imdb-api.com/en/API/Top250Movies/k_mjiovcac");
		String movies = listMovies.search();
		
		//titles
		String[] titlessplited = movies.split("title\":\"");
		
		List<String> titles = new ArrayList<String>();
		
		for (String title : titlessplited) {
			String [] titlesplit = title.split("\",\"full");
			titles.add(titlesplit[0]);
		}
		
		titles.remove(0);
		
		titles.forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		//images
		String[] imagessplited = movies.split("image\":\"");
		
		List<String> images = new ArrayList<String>();
		
		for (String image : imagessplited) {
			String [] imagesplit = image.split("\",\"crew");
			images.add(imagesplit[0]);
		}
		
		images.remove(0);
		
		images.forEach(new Consumer<String>() {
			public void accept(String i) {
				System.out.println(i);
			}
		});

	}

}
