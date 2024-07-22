package com.curso;

public class Comedia extends Pelicula {
	public Comedia(String titulo, String director, int año) {
		super(titulo,director,año);
	}

	void mostrarInformacion(){
		System.out.println("Las películas de comedia buscan hacer reír a la audiencia a través de situaciones humorísticas, diálogos ingeniosos y personajes cómicos.");
	}
}
