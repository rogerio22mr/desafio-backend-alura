package br.com.alura.backend.movies;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class SearchMovies {
	
	HttpClient client = HttpClient.newHttpClient();
	HttpRequest request;
	
	public SearchMovies(String url) {
		request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.build();
	}
	
	
	public String search() {
		String movies = "";
		try {
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			movies = response.body();
		} catch (Exception e) {
			System.out.println("Não foi possivel retornar a solicitação pelo motivo: " + e.getMessage());
		}
		return movies;
	}

}
